public class Problem4 {
    public static boolean isLeapYear(int y){
        if (y % 4 == 0 && y % 100 != 0){
            return true;
        } else {
            return y % 400 == 0;
        }
    }
}
