import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem9Test {

    @Test
    void isInsideCircle() {
        assertAll(
                () -> assertFalse(Problem9.isInsideCircle(1,2,1,6,6)),
                () -> assertTrue(Problem9.isInsideCircle(2,3,5,4,2))
        );
    }
}