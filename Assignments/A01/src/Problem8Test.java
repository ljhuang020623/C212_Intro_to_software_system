import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem8Test {

    @Test
    void not() {
        assertAll(
                () -> assertFalse(Problem8.not(true)),
                () -> assertTrue(Problem8.not(false))
        );
    }
    @Test
    void and() {
        assertAll(
                () -> assertTrue(Problem8.and(true, true)),
                () -> assertFalse(Problem8.and(false, true))
        );
    }

    @Test
    void or() {
        assertAll(
                () -> assertTrue(Problem8.or(true, true)),
                () -> assertTrue(Problem8.or(false, true))
        );
    }

    @Test
    void cond() {
        assertAll(
                () -> assertTrue(Problem8.cond(true, true)),
                () -> assertFalse(Problem8.cond(true, false))
        );
    }

    @Test
    void bicond() {
        assertAll(
                () -> assertFalse(Problem8.bicond(false, true)),
                () -> assertTrue(Problem8.bicond(false, false))
        );
    }
}