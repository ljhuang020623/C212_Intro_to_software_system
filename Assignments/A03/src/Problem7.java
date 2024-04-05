import java.util.HashMap;
import java.util.LinkedHashSet;

class Problem7 {

    /**
     * TODO.
     * @param M The HashMap containing words as keys and their counts as values.
     * @return A LinkedHashSet containing all words sorted by decreasing frequency. Words with the same frequency are not sorted among themselves.
     *
     */
    public static LinkedHashSet<String> largeToSmall(HashMap<String, Integer> M) {
        // Find the highest count
        int c = 0;
        for (Integer count : M.values()) {
            c = Math.max(c, count);
        }

        // Initialize the array of LinkedHashSet
        LinkedHashSet<String>[] array = new LinkedHashSet[c];
        for (int i = 0; i < c; i++) {
            array[i] = new LinkedHashSet<>();
        }

        // Populate the array
        for (String key : M.keySet()) {
            int count = M.get(key);
            array[count - 1].add(key);
        }

        // Assemble the result in reverse order
        LinkedHashSet<String> result = new LinkedHashSet<>();
        for (int i = c - 1; i >= 0; i--) {
            result.addAll(array[i]);
        }

        return result;
    }
}
