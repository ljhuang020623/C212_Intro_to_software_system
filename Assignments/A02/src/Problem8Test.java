import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem8Test {

    @Test
    void circleArea() {
        assertAll("Circle Areas",
                () -> assertEquals(13.9, Problem8.circleArea(2, 0.5, "left"), 0.1),
                () -> assertEquals(9.9, Problem8.circleArea(2, 0.5, "right"), 0.1),
                () -> assertEquals(12.7, Problem8.circleArea(2, 0.5, "midpoint"), 0.1),
                () -> assertEquals(12.5, Problem8.circleArea(2, 0.1, "midpoint"), 0.1),
                () -> assertEquals(314.1, Problem8.circleArea(10, 0.01, "midpoint"), 0.1)
        );
    }
}