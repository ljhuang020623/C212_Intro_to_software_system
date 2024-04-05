public class Problem4 {
    public static String replaceABTR(String s){
        return helper(s, new StringBuilder());
    }
    private static String helper(String s, StringBuilder acc){
        if (s.isEmpty()){
            return acc.toString();
        }
        if(s.charAt(0) == 'A'){
            acc.append('B');
        }else{
            acc.append(s.charAt(0));
        }
        return helper(s.substring(1), acc);

    }
}
