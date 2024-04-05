public class Problem12 {
    public static String stateOfMatter(double t, char u){
        double temp = t;
        if (u == 'F'){
            temp = (double) 5/9 * (t - 32);
        }
        if (temp >= 100){
            return "gas";
        }else if (temp < 100 && temp > 0){
            return "liquid";
        }else{
            return "solid";
        }
    }
}

