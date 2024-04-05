import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {

    public static void main(String[] args) {
        // Test the vector construction from points
        Point p1 = new Point(1, 2, 3);
        Point p2 = new Point(4, 5, 6);
        Vector v1 = new Vector(p1, p2);
        List<Double> components = v1.getVector();
        assert components.equals(Arrays.asList(3.0, 3.0, 3.0)) : "Vector components from points are incorrect.";

        // Test the vector construction from components
        Vector v2 = new Vector(3, 3, 3);
        components = v2.getVector();
        assert components.equals(Arrays.asList(3.0, 3.0, 3.0)) : "Vector components are incorrect.";

        // Test the unit vector calculation
        Vector unitV2 = v2.unitVector(3, 3, 3);
        double magnitude = Math.sqrt(3*3 + 3*3 + 3*3);
        List<Double> expectedUnitComponents = Arrays.asList(3.0/magnitude, 3.0/magnitude, 3.0/magnitude);
        assert unitV2.getVector().equals(expectedUnitComponents) : "Unit vector calculation is incorrect.";

        // Test the dot product calculation
        double dotProduct = v1.dotProduct(v2);
        assert dotProduct == 27.0 : "Dot product calculation is incorrect.";

        // Test the cross product calculation
        Vector v3 = new Vector(1, 0, 0);
        Vector v4 = new Vector(0, 1, 0);
        Vector crossProduct = v3.crossProduct(v4);
        assert crossProduct.getVector().equals(Arrays.asList(0.0, 0.0, 1.0)) : "Cross product calculation is incorrect.";

        System.out.println("Vector tests passed.");
    }

}