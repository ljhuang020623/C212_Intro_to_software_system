import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem6Test {

    @Test
    void computeRoundSum() {
        assertAll(
                () -> assertEquals(20, Problem6.computeRoundSum(15,26,-33)),
                () -> assertEquals(0, Problem6.computeRoundSum(-12,-27,39)),
                () -> assertEquals(30, Problem6.computeRoundSum(7,8,9))
        );
    }
}