public class Problem9 {
    public static boolean isInsideCircle(double cx, double cy, double r, double px, double py){
        return ((cx - r) < px && px < (cx + r)) && (cy - r) < py && py < (cy + r);

    }
}
