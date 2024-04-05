public class Problem5 {
    public static String cutUsername(String email){
        return email.substring(0, email.indexOf("@"));
    }
}
