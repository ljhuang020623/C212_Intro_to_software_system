import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {

    @Test
    void isLeapYear() {
        Assertions.assertAll(
                () ->Assertions.assertTrue(Problem4.isLeapYear(1996)),
                () ->Assertions.assertFalse(Problem4.isLeapYear(1900)),
                () ->Assertions.assertTrue(Problem4.isLeapYear(2000))
        );
    }
}