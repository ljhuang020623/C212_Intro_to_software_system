import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {

    @Test
    void replaceABTR() {
        assertAll(
                () -> assertEquals("BBBBBBB", Problem4.replaceABTR("AAAAAAA")),
                () -> assertEquals("anljvejfei", Problem4.replaceABTR("anljvejfei")),
                () -> assertEquals("", Problem4.replaceABTR("")),
                () -> assertEquals("BceijaaBTRiB", Problem4.replaceABTR("AceijaaATRiB"))
        );
    }
}