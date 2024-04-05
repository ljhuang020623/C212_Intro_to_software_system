import java.util.ArrayList;

public class Problem9 {
    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> temp= new ArrayList<Integer>();
        if (a.size() < b.size()){
            temp = b;
            b = a;
            a = temp;
        }
        for(int i = 0; i <= (a.size() + b.size()); i++){
            if ((i % 2) == 0 && i < a.size()){
                result.add(a.get(i - 1));
            }else{
                result.add(b.get(i - 1));
            }
        }
        return result;
    }
}
