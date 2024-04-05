public class Problem7 {
    public static boolean lessThan20(int x, int y, int z){
        return Math.abs(x - y) < 20 || Math.abs(x - z) < 20 || Math.abs(y - z) < 20;
    }
}
