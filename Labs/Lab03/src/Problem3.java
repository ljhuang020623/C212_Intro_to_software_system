public class Problem3 {
    public static String replaceAB(String s){
        StringBuilder sb = new StringBuilder();
        if (s.isEmpty()){
            return sb.toString();
        }
        if (s.charAt(0) == 'A'){
            sb.append('B');
        }else{
            sb.append(s.charAt(0));
        }
        return sb.toString() + replaceAB(s.substring(1));
    }
}
