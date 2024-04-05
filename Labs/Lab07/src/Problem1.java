import java.util.*;
import java.util.stream.Collectors;

class Problem1 {

    /**
     * Concatenates all strings in the list into a single string, separated by commas.
     * @param los List of strings to be concatenated.
     * @return A single string containing all elements from the list, separated by commas.
     */
    static String conjoin(List<String> los) {
        return los != null ? los.stream().collect(Collectors.joining(", ")) : null;
    }
}
