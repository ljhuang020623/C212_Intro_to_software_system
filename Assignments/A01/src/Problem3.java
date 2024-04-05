public class Problem3 {
    public static double pyramidSurfaceArea(double l, double w, double h){
        return l * w + l * Math.sqrt(Math.pow(w/ 2, 2) + Math.pow(h, 2)) + w * Math.sqrt(Math.pow(l/ 2, 2)+ Math.pow(h, 2));
    }
}
