import java.util.HashSet;

class Problem4 {

    /**
     * TODO.
     * @param mountainHeights An array of integers representing the heights of mountains in a range.
     * @return An array of integers containing all unique peaks found in the input array.
     */
    public static int[] peakFinder(int[] mountainHeights) {
        HashSet<Integer> seenPeaks = new HashSet<>();
        // First pass to count unique peaks
        int uniquePeaksCount = 0;
        for (int i = 1; i < mountainHeights.length - 1; i++) {
            if (mountainHeights[i] > mountainHeights[i - 1] && mountainHeights[i] > mountainHeights[i + 1]) {
                if (seenPeaks.add(mountainHeights[i])) {
                    uniquePeaksCount++;
                }
            }
        }

        // Allocate array for unique peaks
        int[] uniquePeaks = new int[uniquePeaksCount];
        int index = 0;
        // Populate the unique peaks array
        for (Integer peak : seenPeaks) {
            uniquePeaks[index++] = peak;
        }

        return uniquePeaks;
    }
}