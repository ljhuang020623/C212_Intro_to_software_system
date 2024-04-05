public class Point {

    // Instance variables x, y , and z, always private for encapsulation
    private double x;
    private double y;
    private double z;

    // Constructor with parameters of x, y, and z coordinates.
    Point(double x, double y, double z) {
        // Use 'this' to refer to the instance variables.
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Accessor for x
    public double getX(){
        return this.x;
    }

    // Accessor for y
    public double getY(){
        return this.y;
    }

    // Accessor for z
    public double getZ(){
        return this.z;
    }

    public static void main(String[] args) {

    }
}
