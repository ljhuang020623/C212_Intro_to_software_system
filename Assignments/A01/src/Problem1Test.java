import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {

    @Test
    void gigameterToLightSecond() {
        assertAll(
                () -> assertEquals(110.08, Problem1.gigameterToLightsecond(33)),
                () -> assertEquals( 120.08, Problem1.gigameterToLightsecond(36)),
                () -> assertEquals( 510.35, Problem1.gigameterToLightsecond(153))
        );
    }
}