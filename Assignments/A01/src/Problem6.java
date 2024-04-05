public class Problem6 {
    public static int computeRoundSum(int x, int y, int z){
        return lastDigit(x) + lastDigit(y) + lastDigit(z);
    }
    public static int lastDigit(int number) {
        int last = Math.abs(number % 10);
        if (number > 0) {
            if (last >= 5) {
                return number + (10 - last);
            } else {
                return number - last;
            }
        } else {
            if (last > 5) {
                return number - (10 - last);
            } else {
                return number + last;
            }
        }
    }

}
