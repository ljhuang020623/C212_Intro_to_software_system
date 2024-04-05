public class Problem2 {
    public static long subfactorial(int n) {
        if (n == 0) return 1;
        if (n == 1) return 0;
        return (n - 1) * (subfactorial(n - 1) + subfactorial(n - 2));
    }
    private static long subfactorialTRHelper(long n, long a, long b, long counter) {
        if (n == 0) return a;
        if (n == 1) return b;
        return subfactorialTRHelper(n - 1, b, (n - 1) * (a + b), counter + 1);
    }
    public static long subfactorialTR(long n) {
        return subfactorialTRHelper(n, 1, 0, 0);
    }
    public static long subfactorialLoop(long n) {
        if (n == 0) return 1;
        if (n == 1) return 0;
        long a = 1;
        long b = 0;
        for (long i = 2; i <= n; i++) {
            long next = (i - 1) * (a + b);
            a = b;
            b = next;
        }
        return b;
    }
}
