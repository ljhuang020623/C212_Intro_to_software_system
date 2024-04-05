import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem4Test {

    @Test
    void testWithMultiplePeaks() {
        int[] mountainHeights = {1, 3, 2, 7, 5, 6, 4};
        int[] expectedPeaks = {3, 7, 6}; // Assuming order of discovery matters for uniqueness
        assertArrayEquals(expectedPeaks, Problem4.peakFinder(mountainHeights));
    }

    @Test
    void testWithNoPeaks() {
        int[] mountainHeights = {1, 1, 1, 1, 1};
        int[] expectedPeaks = {};
        assertArrayEquals(expectedPeaks, Problem4.peakFinder(mountainHeights));
    }

    @Test
    void testWithAscendingAndDescendingMountains() {
        int[] mountainHeights = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        int[] expectedPeaks = {5};
        assertArrayEquals(expectedPeaks, Problem4.peakFinder(mountainHeights));
    }

    @Test
    void testWithSinglePeak() {
        int[] mountainHeights = {5, 10, 5};
        int[] expectedPeaks = {10};
        assertArrayEquals(expectedPeaks, Problem4.peakFinder(mountainHeights));
    }

    @Test
    void testWithAllPeaksSameHeight() {
        int[] mountainHeights = {1, 3, 1, 3, 1};
        int[] expectedPeaks = {3}; // Since peaks must be unique in height
        assertArrayEquals(expectedPeaks, Problem4.peakFinder(mountainHeights));
    }

    @Test
    void testEmptyArray() {
        int[] mountainHeights = {};
        int[] expectedPeaks = {};
        assertArrayEquals(expectedPeaks, Problem4.peakFinder(mountainHeights));
    }

    @Test
    void testSingleElementArray() {
        int[] mountainHeights = {1};
        int[] expectedPeaks = {}; // Single element cannot be a peak
        assertArrayEquals(expectedPeaks, Problem4.peakFinder(mountainHeights));
    }
}
