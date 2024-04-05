import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem11Test {

    @Test
    void isValidIpv4() {
        assertAll(
                () -> assertTrue(Problem11.isValidIpv4("192.168.1.244")),
                () -> assertTrue(Problem11.isValidIpv4("192.168.192.52")),
                () -> assertFalse(Problem11.isValidIpv4("192.168.1.256")),
                () -> assertFalse(Problem11.isValidIpv4("192.168.1201.23")),
                () -> assertFalse(Problem11.isValidIpv4("192.168.1201.ABC")),
                () -> assertFalse(Problem11.isValidIpv4("ABC.DEF.GHI")),
                () -> assertFalse(Problem11.isValidIpv4("192.168.1A6.201"))
        );
    }
}