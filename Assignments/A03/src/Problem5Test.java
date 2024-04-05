import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class Problem5Test {

    @Test
        void testTokenizeSimpleComma() {
            // Test with simple comma-separated values
            ArrayList<String> expected = new ArrayList<>(Arrays.asList("hello", "world", "this", "is", "a", "test"));
            assertIterableEquals(expected, Problem5.tokenize("hello,world,this,is,a,test", ','));
        }

        @Test
        void testTokenizeSingleCharacter() {
            // Test with a single character
            ArrayList<String> expected = new ArrayList<>(Arrays.asList("a"));
            assertIterableEquals(expected, Problem5.tokenize("a", ','));
        }

        @Test
        void testTokenizeConsecutiveDelimiters() {
            // Test with consecutive delimiters
            ArrayList<String> expected = new ArrayList<>(Arrays.asList("hello", "world"));
            assertIterableEquals(expected, Problem5.tokenize("hello,,world", ','));
        }

        @Test
        void testTokenizeNoDelimiter() {
            // Test string without the delimiter
            ArrayList<String> expected = new ArrayList<>(Arrays.asList("helloworld"));
            assertIterableEquals(expected, Problem5.tokenize("helloworld", ','));
        }

        @Test
        void testTokenizeEmptyString() {
            // Test with an empty string
            ArrayList<String> expected = new ArrayList<>();
            assertIterableEquals(expected, Problem5.tokenize("", ','));
        }

        @Test
        void testTokenizeEndsWithDelimiter() {
            // Test string that ends with a delimiter
            ArrayList<String> expected = new ArrayList<>(Arrays.asList("hello", "world"));
            assertIterableEquals(expected, Problem5.tokenize("hello,world,", ','));
        }

        @Test
        void testTokenizeStartsWithDelimiter() {
            // Test string that starts with a delimiter
            ArrayList<String> expected = new ArrayList<>(Arrays.asList("hello", "world"));
            assertIterableEquals(expected, Problem5.tokenize(",hello,world", ','));
        }
}
