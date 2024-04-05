import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem7Test {

    @Test
    void lessThan20() {
        assertAll(
                () -> assertTrue(Problem7.lessThan20(2,19,212)),
                () -> assertFalse(Problem7.lessThan20(999,888,777))
        );
    }
}