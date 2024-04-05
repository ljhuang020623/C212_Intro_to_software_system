public class Problem3{
    public static String frontTimes(String str, int n){
        StringBuilder result = new StringBuilder();
        String front = "";
        if(str.length() < 3){
            front = str;
        }else{
            front = str.substring(0, 3);
        }

        for( int i = 0; i < n; i++){
            result.append(front);
        }
        return result.toString();
    }
}