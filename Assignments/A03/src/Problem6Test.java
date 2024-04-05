import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem6Test {

    @Test
    void testWithPunctuation() {
        String input = "Hello world, the world is healthy, is it not? I certainly agree that the world is #1 and healthy.";
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("hello", 1);
        expected.put("world", 3);
        expected.put("the", 2);
        expected.put("is", 3);
        expected.put("healthy", 2);
        expected.put("it", 1);
        expected.put("i", 1);
        expected.put("certainly", 1);
        expected.put("agree", 1);
        expected.put("that", 1);
        expected.put("1", 1);
        expected.put("and", 1);
        expected.put("not", 1);

        assertEquals(expected, Problem6.wordCount(input));
    }

    @Test
    void testWithCapitalization() {
        String input = "Apple apple APPLE.";
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("apple", 3);

        assertEquals(expected, Problem6.wordCount(input));
    }

    @Test
    void testWithNumbers() {
        String input = "123 456 123.";
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("123", 2);
        expected.put("456", 1);

        assertEquals(expected, Problem6.wordCount(input));
    }

    @Test
    void testWithEmptyString() {
        String input = "";
        HashMap<String, Integer> expected = new HashMap<>();

        assertEquals(expected, Problem6.wordCount(input));
    }

    @Test
    void testWithSpaces() {
        String input = "   ";
        HashMap<String, Integer> expected = new HashMap<>();

        assertEquals(expected, Problem6.wordCount(input));
    }
}
