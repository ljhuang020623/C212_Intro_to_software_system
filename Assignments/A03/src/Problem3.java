import java.util.HashSet;
import java.util.Set;
import java.util.List;

class Problem3 {

    /**
     * TODO.
     * @param A An array of integers to search through for pairs that sum up to {@code t}.
     * @param t The target sum for the pairs of numbers.
     * @return A set containing lists, where each list is a unique pair of integers from {@code A} that sum up to {@code t}.
     *         If no such pairs are found, an empty set is returned. The pairs are ordered such that the smaller number
     *         comes first in each list.
     */
    static Set<List<Integer>> twoSum(int[] A, int t) {
        Set<Integer> seenNumbers = new HashSet<>();
        Set<List<Integer>> resultPairs = new HashSet<>();

        for (int n: A){
            int complement = t - n;
            if (seenNumbers.contains(complement)){
                int min = Math.min(n, complement);
                int max = Math.max(n, complement);
                resultPairs.add(List.of(min, max));
            }
            seenNumbers.add(n);
        }
        return resultPairs;
    }
}