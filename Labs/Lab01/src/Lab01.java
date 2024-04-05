public class Lab01 {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    public static double billTotal(double subtotal) {
        double tax = subtotal * 0.0675; // 6.75% tax
        double tip = (subtotal + tax) * 0.20; // 20% tip

        return subtotal + tax + tip;
    }
    public static double pointDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static int sumOfSquares(int x, int y) {
        return (x * x) + (y * y);
    }
}
