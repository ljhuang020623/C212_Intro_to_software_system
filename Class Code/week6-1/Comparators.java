import java.util.Comparator;

public class Comparators {

    /**
     * compare strings based upon the length
     */
    public static Comparator<String> lengthComparator = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o2.length() - o1.length();
        }
    };

    public static Comparator<String> reverseOrderComparator = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        }
    };

}
