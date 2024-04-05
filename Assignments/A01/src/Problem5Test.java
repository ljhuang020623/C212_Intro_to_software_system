import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem5Test {

    @Test
    void cutUsername() {
        assertAll(
                () -> assertEquals("leghuang", Problem5.cutUsername("leghuang@iu.edu")),
                () -> assertEquals("equal", Problem5.cutUsername("equal@iu.edu")),
                () -> assertEquals("light", Problem5.cutUsername("light@iu.edu"))
        );
    }
}