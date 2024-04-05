import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class StreamMethods {
    public static List<String> removeLonger(List<String> los, int n) {
        return los.stream()
                .filter(s -> s.length() <= n)
                .collect(Collectors.toList());
    }
    public static List<Integer> sqAddFiveOmit(List<Integer> lon) {
        return lon.stream()
                .map(n -> n * n + 5)
                .filter(n -> n % 10 != 5 && n % 10 != 6)
                .collect(Collectors.toList());
    }
    public static Map<Integer, Integer> groupLength(List<String> los) {
        return los.stream()
                .collect(Collectors.groupingBy(String::length,
                        Collectors.reducing(0, e -> 1, Integer::sum)));
    }
}
