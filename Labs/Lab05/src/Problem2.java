import java.util.ArrayList;

public class Problem2 {
    public static double sumNasty(ArrayList<Integer> vals){
        if (vals.isEmpty()){
            return 0.0;
        }

        int acc = 0; // Accumulator for the sum
        int items = 0; // Counter for the number of items considered in the sum

        for(int n = 0; n < vals.size(); n ++){
            if (vals.get(n) == 9) {
                // If 9 is not the last element, skip the next element
                if (n != vals.size() - 1) {
                    n++; // Skip the next number
                }
            } else {
                acc += vals.get(n);
                items++;
            }
        }
        if (items == 0){
            return 0.0;
        }else{
            return (double) acc / items;
        }
    }
}
