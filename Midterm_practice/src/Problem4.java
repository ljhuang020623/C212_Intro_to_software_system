public class Problem4 {
    public static String alarmClock(int day, boolean vacation){
        if (vacation){
            if (day  == 6 || day  == 0){
                return "off";
            }else{
                return "10:00";
            }
        }else{
            if (day  == 6 || day  == 0){
                return "10:00";
            }else{
                return "7:00";
            }
        }
    }
}
