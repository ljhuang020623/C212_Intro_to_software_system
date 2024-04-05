import java.util.Arrays;
import java.util.List;

public class Vector {
    // Instance variables x, y , and z, always private for encapsulation
    private double x;
    private double y;
    private double z;

    // Constructor that receives two point objects adn constructs the vector from those
    public Vector(Point A, Point B) {
        this.x = B.getX() - A.getX();
        this.y = B.getY() - A.getY();
        this.z = B.getZ() - A.getZ();
    }

    // Constructor that receives the three components x, y, z and directly create the vectors from those
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Accessor for x
    public double getX(){
        return x;
    }

    // Accessor for y
    public double getY(){
        return y;
    }

    // Accessor for z
    public double getZ(){
        return z;
    }

    // Accessor that returns the vector components as a list
    public List<Double> getVector(){
        return Arrays.asList();
    }

    // UnitVector instance method
    public Vector unitVector(double x, double y, double z){

        // Calculate the magnitude of the vector
        double magnitude = Math.sqrt(x*x + y*y + z*z);

        // Unit vector
        double unitX = x / magnitude;
        double unitY = y / magnitude;
        double unitZ = z / magnitude;

        return new Vector(unitX, unitY, unitZ);
    }

    // DotProduct instance method
    public double dotProduct(Vector v){
        return this.x * v.getX() + this.y * v.getY() + this.z * v.getZ();
    }

    // CrossProduct instance method
    public Vector crossProduct(Vector v){

        double vX = this.y * v.getZ() - this.z * v.getY();
        double vY = this.z * v.getX() - this.x * v.getZ();
        double vZ = this.x * v.getY() - this.y * v.getX();

        if (vX == 0 && vY == 0 && vZ == 0){
            return null;
        }else{
            return new Vector(vX, vY, vZ);
        }
    }
    public static void main(String[] args){
    }


}

