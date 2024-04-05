import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2Test {

    @Test
    void countStrTR() {
        assertAll(
                () -> assertEquals(4, Problem2.countStrTR("strstrstrstr")),
                () -> assertEquals(3, Problem2.countStrTR("strstrstrtsr")),
                () -> assertEquals(0, Problem2.countStrTR("apiejoejewr")),
                () -> assertEquals(2, Problem2.countStrTR("kihewrhhstrstr"))
        );
    }
}