import static org.junit.jupiter.api.Assertions.*;

class Lab01Test {

    @org.junit.jupiter.api.Test
    void celsiusToFahrenheit() {
        double celsius1 = 0.0;
        double expectedFahrenheit1 = 32.0;
        double result1 = Lab01.celsiusToFahrenheit(celsius1);
        assertEquals(expectedFahrenheit1, result1, 0.001);

        double celsius2 = 25.0;
        double expectedFahrenheit2 = 77.0;
        double result2 = Lab01.celsiusToFahrenheit(celsius2);
        assertEquals(expectedFahrenheit2, result2, 0.001);

        double celsius3 = -10.0;
        double expectedFahrenheit3 = 14.0;
        double result3 = Lab01.celsiusToFahrenheit(celsius3);
        assertEquals(expectedFahrenheit3, result3, 0.001);
    }

    @org.junit.jupiter.api.Test
    void billTotal() {
        double subtotal1 = 100.0;
        double expectedTotal1 = 128.1;
        double result1 = Lab01.billTotal(subtotal1);
        assertEquals(expectedTotal1, result1, 0.001);
    }

    @org.junit.jupiter.api.Test
    void pointDistance() {
        double x1 = 1.0;
        double y1 = 2.0;
        double x2 = 4.0;
        double y2 = 6.0;
        double expectedDistance1 = 5.0;
        double result1 = Lab01.pointDistance(x1, y1, x2, y2);
        assertEquals(expectedDistance1, result1, 0.001);
    }

    @org.junit.jupiter.api.Test
    void sumOfSquares() {
        int x1 = 3;
        int y1 = 4;
        int expectedSum1 = 25;
        int result1 = Lab01.sumOfSquares(x1, y1);
        assertEquals(expectedSum1, result1);
    }
}
