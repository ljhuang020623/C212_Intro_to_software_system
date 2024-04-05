import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem2Test {

    @Test
    void testMedianWithEvenTotalLength() {
        int[] A = {1, 3, 5};
        int[] B = {2, 4, 6};
        assertEquals(3, Problem2.median(A, B));
    }

    @Test
    void testMedianWithOddTotalLength() {
        int[] A = {1, 3};
        int[] B = {2, 4, 6};
        assertEquals(3, Problem2.median(A, B));
    }

    @Test
    void testMedianWithEmptyFirstArray() {
        int[] A = {};
        int[] B = {1, 2, 3, 4, 5};
        assertEquals(3, Problem2.median(A, B));
    }

    @Test
    void testMedianWithEmptySecondArray() {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {};
        assertEquals(3, Problem2.median(A, B));
    }

    @Test
    void testMedianWithBothEmptyArrays() {
        int[] A = {};
        int[] B = {};
        assertEquals(0, Problem2.median(A, B)); // Assuming default median for empty arrays is 0
    }
}
