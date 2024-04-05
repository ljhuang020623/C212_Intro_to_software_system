public class Problem6 {
    public static int strSumNums(String s) {
        int sum = 0;
        StringBuilder temp = new StringBuilder("0");

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                temp.append(c);
            } else {

                sum += Integer.parseInt(temp.toString());
                temp = new StringBuilder("0");
            }
        }

        sum += Integer.parseInt(temp.toString());

        return sum;
    }
}
