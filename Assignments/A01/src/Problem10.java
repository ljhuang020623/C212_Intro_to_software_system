public class Problem10 {
    public static int fitCandy(int x, int l, int w) {
        int totalWeight = l * 5 + x;
        if (totalWeight < w) {
            return -1;
        } else if (totalWeight > w) {
            if ((l * 5) > w) {
                if (((w - l * 5) < 0) && ((w - ((l - 1) * 5)) > x)) {
                    return -1;
                }
                else{
                    return x;
                }
            } else if ((l * 5) < w) {
                return w - l * 5;
            } else {
                return 0;
            }
        } else {
            return x    ;
        }
    }
}
