public class Problem7 {
    public static int countPairs(int n) {
        int count = 0;
        for (int a = 1; a < n; a++) {
            for (int b = a; b < n; b++) {
                if ((a * a + b * b + 1) % (a * b) == 0) {
                    count++;
                }
            }
        }
        return count;
    }

}
