public class Problem3 {
    public static String collatz(int n) {
        if (n == 1) return "1";
        return n + "," + (n % 2 == 0 ? collatz(n / 2) : collatz(3 * n + 1));
    }
    private static String collatzTRHelper(int n, String acc) {
        if (n == 1) return acc + "1";
        return collatzTRHelper(n % 2 == 0 ? n / 2 : 3 * n + 1, acc + n + ",");
    }

    public static String collatzTR(int n) {
        return collatzTRHelper(n, "");
    }
    public static String collatzLoop(int n) {
        StringBuilder sequence = new StringBuilder();
        while (n != 1) {
            sequence.append(n).append(",");
            n = n % 2 == 0 ? n / 2 : 3 * n + 1;
        }
        sequence.append("1");
        return sequence.toString();
    }

}
