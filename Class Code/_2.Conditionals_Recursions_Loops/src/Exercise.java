public class Exercise {
    /**
     * Generates a multiplication table string for numbers from 'a' to 'b'.
     *
     * @param a - Starting number.
     * @param b - Ending number.
     * @return - Multiplication table as a string.
     */
    public static String multTable(int a, int b){
        StringBuilder sb = new StringBuilder();
        for (int i = 1 ; i <= a ; i ++){
            for (int j = 1 ; j <= b ; j ++){
                int multiplication = i * j;
                sb.append(i).append("*").append(j).append("=").append(multiplication);
                if(i != a || j != b){
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }
}
