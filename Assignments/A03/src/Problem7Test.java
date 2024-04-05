import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem7Test {

    @Test
    void testSingleFrequencyWords() {
        HashMap<String, Integer> input = new HashMap<>();
        input.put("hello", 1);
        input.put("world", 1);

        LinkedHashSet<String> expected = new LinkedHashSet<>(Arrays.asList("hello", "world"));
        assertEquals(expected, Problem7.largeToSmall(input));
    }

    @Test
    void testMultipleFrequencyWords() {
        HashMap<String, Integer> input = new HashMap<>();
        input.put("hello", 1);
        input.put("world", 3);
        input.put("java", 2);
        input.put("programming", 3);

        // The order within the same frequency does not matter
        LinkedHashSet<String> expected = new LinkedHashSet<>(Arrays.asList("world", "programming", "java", "hello"));
        assertEquals(expected, Problem7.largeToSmall(input));
    }

    @Test
    void testEmptyMap() {
        HashMap<String, Integer> input = new HashMap<>();
        LinkedHashSet<String> expected = new LinkedHashSet<>();
        assertEquals(expected, Problem7.largeToSmall(input));
    }

    @Test
    void testSingleElementMap() {
        HashMap<String, Integer> input = new HashMap<>();
        input.put("singleton", 1);

        LinkedHashSet<String> expected = new LinkedHashSet<>(Arrays.asList("singleton"));
        assertEquals(expected, Problem7.largeToSmall(input));
    }

    @Test
    void testAllSameFrequency() {
        HashMap<String, Integer> input = new HashMap<>();
        input.put("one", 2);
        input.put("two", 2);
        input.put("three", 2);

        // The order within the same frequency does not matter
        LinkedHashSet<String> expected = new LinkedHashSet<>(Arrays.asList("one", "two", "three"));
        assertEquals(expected, Problem7.largeToSmall(input));
    }
}
