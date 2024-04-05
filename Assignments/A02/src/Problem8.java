public class Problem8 {
    public static double circleArea(double r, double delta, String method) {
        int n = (int) (r / delta);
        double area = 0;
        for (int i = 0; i < n; i++) {
            double x = method.equals("left") ? i * delta :
                    method.equals("right") ? (i + 1) * delta :
                            (i + 0.5) * delta;
            double height = Math.sqrt(r * r - x * x);
            area += height * delta;
        }
        return area * 4;
    }
}
