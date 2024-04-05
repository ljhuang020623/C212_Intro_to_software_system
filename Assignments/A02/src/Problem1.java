public class Problem1 {
    public static int gcdTR(int a, int b) {
        return gcdTRHelper(Math.abs(a), Math.abs(b));
    }

    private static int gcdTRHelper(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcdTRHelper(b, a % b);
    }

    public static int gcdLoop(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
