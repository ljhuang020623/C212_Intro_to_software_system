import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {

    @Test
    void userId() {
        Assertions.assertAll(
                () ->Assertions.assertEquals("CrottJ99", Problem1.userId("Joshua", "Crotts", 1999)),
                () ->Assertions.assertEquals("JohnsK18", Problem1.userId("Katherine", "Johnson", 1918)),
                () ->Assertions.assertEquals("FuF57", Problem1.userId("Fred", "Fu", 1957))
        );
    }
}