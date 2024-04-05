import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {

    @Test
    void pyramidSurfaceArea() {
        assertAll(
                () -> assertEquals(26.91332062217051, Problem3.pyramidSurfaceArea(2,3,4)),
                () -> assertEquals(112.67707177127505, Problem3.pyramidSurfaceArea(5,6,7)),
                () -> assertEquals(11.2450401904666, Problem3.pyramidSurfaceArea(1,2,3))
        );

    }
}