import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {

    @Test
    void flStrip() {
        assertAll(
                () -> assertEquals("trin", Problem4.flStrip("string")),
                () -> assertEquals("qua", Problem4.flStrip("equal")),
                () -> assertEquals("igh", Problem4.flStrip("light"))
        );
    }
}