import java.util.List;
import java.util.stream.Collectors;

class Problem2 {

    /**
     * Adds "y" to the end of each string in the list and removes any strings that contain "yy".
     * @param los The list of strings to be processed.
     * @return A new list with processed strings.
     */
    static List<String> addYRemoveYY(List<String> los) {
        return los.stream()
                .map(s -> s + "y") // Add "y" to the end of each string
                .filter(s -> !s.contains("yy")) // Remove strings that contain "yy"
                .collect(Collectors.toList()); // Collect the results into a new list
    }
}
