public class Examples {
    private static boolean isZero(int n) {
        return n == 1;
    }
    /**
     * This method use recursive to calculate factorial
     * @param n
     * @return The factorial of n.
     */
    public static int fact(int n){
        if(isZero(n)){
            return 1;
        }else{
            return n * fact(n - 1);
        }
    }
    /**
    * This method use tail recursive to calculate factorial
    * @param n
    * @return The factorial of n.
    */
    public static int factTR(int n, int acc){
        if(isZero(n)){
            return acc;
        }else{
            return factTR(n - 1, n * acc);
        }
    }
}
