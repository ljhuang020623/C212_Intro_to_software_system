public class Problem1 {
    public static String userId(String f, String l, int y){
        if (l.length() > 5){
            return l.substring(0, 5) + f.charAt(0) + y % 1900;
        }else{
            return l + f.charAt(0) + y % 1900;
        }
    }
}
