public class Problem1 {
    public static int countStr(String s){
        int count = 0;
        if (s.length() < 3) {
            return 0;
        }
        if(s.startsWith("str")){
            return 1 + countStr(s.substring(1));
        }else{
            return countStr(s.substring(1));
        }
    }
}
