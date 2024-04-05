import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {

    @Test
    void sortThreeStrings() {
        Assertions.assertAll(
                () ->Assertions.assertEquals("Able,Baker,Charlie", Problem3.sortThreeStrings("Charlie","Able", "Baker"))
        );
    }
}