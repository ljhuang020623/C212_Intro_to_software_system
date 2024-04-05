import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {

    @Test
    void replaceAB() {
        assertAll(
            () -> assertEquals("BBBBBBB", Problem3.replaceAB("AAAAAAA")),
            () -> assertEquals("anljvejfei", Problem3.replaceAB("anljvejfei")),
            () -> assertEquals("", Problem3.replaceAB("")),
            () -> assertEquals("BceijaaBTRiB", Problem3.replaceAB("AceijaaATRiB"))
    );
    }
}