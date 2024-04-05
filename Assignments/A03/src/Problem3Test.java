import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem3Test {

    @Test
    void testTwoSumBasic() {
        // Test with basic input
        int[] A = {2, 2, 4, 10, 6, -2};
        int t = 4;
        Set<List<Integer>> expected = new HashSet<>(Arrays.asList(
                Arrays.asList(2, 2),
                Arrays.asList(-2, 6)
        ));
        assertEquals(expected, Problem3.twoSum(A, t));
    }

    @Test
    void testTwoSumSinglePair() {
        // Test with input where exactly one pair sums up to the target
        int[] A = {0, 4, -3, 1, 3};
        int t = 0;
        Set<List<Integer>> expected = new HashSet<>(Arrays.asList(
                Arrays.asList(-3, 3)
        ));
        assertEquals(expected, Problem3.twoSum(A, t));
    }

    @Test
    void testTwoSumMultiplePairs() {
        // Test with multiple pairs summing up to the target
        int[] A = {1, 5, 3, -1, 4, 2, -2, 2};
        int t = 3;
        Set<List<Integer>> expected = new HashSet<>(Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(-1, 4),
                Arrays.asList(-2, 5)
        ));
        assertEquals(expected, Problem3.twoSum(A, t));
    }

    @Test
    void testTwoSumWithZero() {
        // Test with a pair that includes zero
        int[] A = {-5, 5, 0, 10};
        int t = 0;
        Set<List<Integer>> expected = new HashSet<>(Arrays.asList(
                Arrays.asList(-5, 5)
        ));
        assertEquals(expected, Problem3.twoSum(A, t));
    }
}
