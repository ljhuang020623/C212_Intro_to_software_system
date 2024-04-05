import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem12Test {

    @Test
    void stateOfMatter() {
        assertAll(
                () -> assertEquals("gas", Problem12.stateOfMatter(112,'C')),
                () -> assertEquals("solid", Problem12.stateOfMatter(30.2,'F')),
                () -> assertEquals("liquid", Problem12.stateOfMatter(77,'F'))
        );
    }
}