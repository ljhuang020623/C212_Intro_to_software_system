public class Problem2 {
    public static int countStrTR(String s){
        return helper(s, 0);
    }
    private static int helper(String s, int acc){
        if (s.length() < 3){
            return acc;
        }
        if (s.startsWith("str")){
            acc += 1;
        }
        return helper(s.substring(1), acc);
    }
}
