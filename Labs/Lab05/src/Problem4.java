import java.util.ArrayList;

public class Problem4 {
    public static ArrayList<String> shift(ArrayList<String> ls, int i){
        ArrayList<String> result = new ArrayList<>(ls);
        int size = ls.size();

        if (ls.isEmpty() || ls.size() == 1 || ls.size() == 2 && (i % 2) == 0){
            return new ArrayList<>(ls);
        }
        if (ls.size() == 2){
            { String temp = ls.get(0);
              result.set(0, ls.get(1));
              result.set(1, temp);
            }
        }
        for (int n = 0; n < size; n++) {
            int newIndex = (n + i) % size;
            if (newIndex < 0) {
                newIndex += size;
            }
            result.set(newIndex, ls.get(n));
        }

        return result;
    }


}
