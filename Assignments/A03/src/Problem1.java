class Problem1 {

    /**
     * TODO.
     * @param min The starting integer of the range to apply the FizzBuzz pattern to.
     * @param max The ending integer of the range to apply the FizzBuzz pattern to.
     * @return An array of strings representing the FizzBuzz pattern for the specified range.
     */
    static String[] fizzBuzz(int min, int max) {
        int n = 0;
        String[] result = new String[max - min + 1];
        for (int i = min; i <= max ; i ++){
            if (i % 3 == 0 && i % 5 == 0){
                result[n] = "FizzBuzz";
            }else if (i % 3 == 0){
                result[n] = "Fizz";
            }else if ( i % 5 == 0){
                result[n] = "Buzz";
            }else{
                result[n] = String.valueOf(i);
            }
            n++;
        }
        return result;
    }
}