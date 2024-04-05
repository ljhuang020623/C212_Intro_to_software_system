public class Problem3 {
    public static int[] countEvenOdds(int[] vals){
        int[] tuple = new int[2];

        int even = 0;
        int odd = 0;
        for (int n = 0; n < vals.length; n ++) {
            if (vals[n] % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }
        tuple[0] = even;
        tuple[1] = odd;

        return tuple;
    }
}
