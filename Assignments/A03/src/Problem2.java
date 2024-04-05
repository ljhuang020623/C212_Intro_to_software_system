class Problem2 {

    /**
     * TODO.
     * @param A The first sorted array of integers.
     * @param B The second sorted array of integers.
     * @return The median of the combined arrays. If the combined array length is even, returns the average of the two middle numbers. If odd, returns the middle number.
     */
    public static int median(int[] A, int[] B) {
        int totalLength = A.length + B.length;
        int[] merged = new int[totalLength];

        int i = 0, j = 0, k = 0;

        // Merge A and B into merged array
        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                merged[k++] = A[i++];
            } else {
                merged[k++] = B[j++];
            }
        }

        // Add remaining elements from A
        while (i < A.length) {
            merged[k++] = A[i++];
        }

        // Add remaining elements from B
        while (j < B.length) {
            merged[k++] = B[j++];
        }

        // Find the median of the merged array
        if (totalLength % 2 == 0) {
            return (merged[(totalLength / 2) - 1] + merged[totalLength / 2]) / 2;
        } else {
            return merged[totalLength / 2];
        }
    }
}