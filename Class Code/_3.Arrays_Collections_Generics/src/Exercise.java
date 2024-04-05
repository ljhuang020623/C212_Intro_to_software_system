public class Exercise {
    /**
     * 3.1
     * 
     * @param A
     * @return An array of integers where each element has been modified.
     */
    public static int[] operate(int[] A){
        for (int i = 0 ; i < A.length ; i ++){
            if (i % 2 != 0){
                A[i] *= (i + 1);
            }else{
                A[i] /= (i + 1);
            }
        }
        return A;
    }
    /**
     * 3.2
     *
     * @param arr
     * @result whether arr all contain Prime numbers or not
     */
    public static boolean containsOnlyPrime(int[] arr){
        for (int i = 0; i < arr.length; i ++ ){
            for(int j = arr[i] - 1; j > 1; j --){
                if(arr[i] % j == 0){
                    return false;
                }
            }
            if (arr[i] == 0 || arr[i] == 1){
                return false;
            }
        }
        return true;
    }
    /**
     * 3.4
     * Computes the cumulative sum of an input integer array.
     *
     * @param A Input array of integers.
     * @return An array with cumulative sums of the input elements.
     */
    public static int[] accSum(int[] A){
        for (int i = 1; i < A.length; i ++){
            A[i] += A[i - 1];
        }
        return A;
    }
}
