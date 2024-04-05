import java.util.List;

public class Problem10 {

    public static <T extends List<Integer>> boolean areParallelLists(T t, T u) {
        if (t == null || u == null || t.isEmpty() || u.isEmpty() || t.size() != u.size()) {
            return false;
        }

        // Determine the factor by using the first element of each list.
        // Handle division by zero if the first element of t is 0.
        Integer firstT = t.get(0);
        Integer firstU = u.get(0);
        if (firstT == 0 || firstU == 0) {
            if (!firstT.equals(firstU)) { // If one is zero but not both, lists are not parallel.
                return false;
            }
            // If both are zero, check the rest of the lists without determining a factor.
            for (int i = 1; i < t.size(); i++) {
                if (!t.get(i).equals(u.get(i))) {
                    return false;
                }
            }
            return true;
        }

        double k = (double) firstU / firstT;

        for (int i = 1; i < t.size(); i++) {
            double currentK = (double) u.get(i) / t.get(i);
            if (currentK != k) {
                return false;
            }
        }

        return true;
    }
}
