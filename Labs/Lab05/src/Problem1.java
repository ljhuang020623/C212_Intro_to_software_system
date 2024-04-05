public class Problem1 {
    public static int[] accSum(int[] A){
        int[] result = new int[A.length];
        int acc = 0;
        for (int i = 0; i < A.length; i++) {
            acc += A[i];
            result[i] = acc;
        }
        return result;
    }
}
