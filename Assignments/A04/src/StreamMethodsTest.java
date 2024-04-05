import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StreamMethodsTest {

    @Test
    public void testRemoveLonger() {
        List<String> input = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> expected = Arrays.asList("date");
        List<String> result = StreamMethods.removeLonger(input, 4);
        assertEquals(expected, result, "The method should remove strings longer than 4 characters.");
    }

    @Test
    public void testSqAddFiveOmit() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(9, 14, 21, 30);
        List<Integer> result = StreamMethods.sqAddFiveOmit(input);
        assertEquals(expected, result, "The method should square numbers, add five, and omit those ending in 5 or 6.");
    }

    @Test
    public void testGroupLength() {
        List<String> input = Arrays.asList("hi", "map", "bin", "car");
        Map<Integer, Integer> expected = Map.of(
                2, 1,
                3, 3
        );
        Map<Integer, Integer> result = StreamMethods.groupLength(input);
        assertTrue(expected.equals(result), "The method should group strings by their length and count them.");
    }
}
