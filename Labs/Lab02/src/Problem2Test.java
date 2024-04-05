import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2Test {

    @Test
    void computeGpa() {
        Assertions.assertAll(
                () ->Assertions.assertEquals(4.0, Problem2.computeGpa("A")),
                () ->Assertions.assertEquals(2.7, Problem2.computeGpa("B-")),
                () ->Assertions.assertEquals(0.0, Problem2.computeGpa("F"))
        );
    }
}