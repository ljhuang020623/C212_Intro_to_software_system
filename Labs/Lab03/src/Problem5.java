public class Problem5 {
    public static long hyperfactorial(long n){
        if(n == 0){
            return 0;
        }else if (n == 1){
            return 1;
        }
        return (long)(Math.pow(n,n) * hyperfactorial(n - 1));
    }
    public static long hyperfactorialTR(long n){
        return helper(n, 1);
    }

    private static long helper(long n, long acc){
        if(n == 0){
            return 0;
        }else if (n == 1){
            return acc;
        }
        return helper(n - 1, (long)Math.pow(n,n) * acc);
    }
}
