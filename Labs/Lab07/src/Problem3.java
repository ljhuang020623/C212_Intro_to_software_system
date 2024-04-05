import java.util.List;
import java.util.stream.Collectors;

class Problem3 {

    /**
     * Filters out odd numbers from the list, squares the remaining even numbers,
     * and returns a new list of these squared values.
     * @param lon The list of Double values to be processed.
     * @return A new list containing the squared values of the even numbers from the original list.
     */
    static List<Double> filterThenSquare(List<Double> lon) {
        return lon.stream()
                // Filter out odd numbers. Since Double doesn't support % operator directly,
                // we need to convert to int for the comparison.
                .filter(d -> d % 2 == 0)
                // Square the remaining numbers.
                .map(d -> d * d)
                // Collect the results into a new list.
                .collect(Collectors.toList());
    }
}
