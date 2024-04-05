public class Problem3 {
    public static String sortThreeStrings(String a, String b, String c){
        String temp;
        if (a.compareTo(b) > 0){
            temp = a;
            a = b;
            b = temp;
        }
        if (b.compareTo(c) > 0) {
            temp = b;
            b = c;
            c = temp;
            if (a.compareTo(b) > 0) {
                temp = a;
                a = b;
                b = temp;
            }
        }
        return a + "," + b + "," + c;
    }
}
