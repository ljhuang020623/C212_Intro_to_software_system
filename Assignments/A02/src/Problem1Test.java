import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;

import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {

    @org.junit.jupiter.api.Test
    void gcdTR() {
        assertAll(
                () -> assertEquals(8, Problem1.gcdTR(32,8)),
                () -> assertEquals(10, Problem1.gcdTR(100,10)),
                () -> assertEquals(1, Problem1.gcdTR(41,9)),
                () -> assertEquals(1, Problem1.gcdTR(6,1)),
                () -> assertEquals(13, Problem1.gcdTR(13,169)),
                () -> assertEquals(1, Problem1.gcdTR(1,1)),
                () -> assertEquals(0, Problem1.gcdLoop(0,0)),
                () -> assertEquals(3, Problem1.gcdLoop(-9,-6)),
                () -> assertEquals(1, Problem1.gcdTR(15,241))
        );
    }

    @Test
    void gcdLoop() {
        assertAll(
            () -> assertEquals(8, Problem1.gcdLoop(32,8)),
            () -> assertEquals(10, Problem1.gcdLoop(100,10)),
            () -> assertEquals(1, Problem1.gcdLoop(41,9)),
            () -> assertEquals(1, Problem1.gcdLoop(6,1)),
            () -> assertEquals(13, Problem1.gcdLoop(13,169)),
            () -> assertEquals(1, Problem1.gcdLoop(1,1)),
            () -> assertEquals(0, Problem1.gcdLoop(0,0)),
            () -> assertEquals(3, Problem1.gcdLoop(-9,-6)),
            () -> assertEquals(1, Problem1.gcdLoop(15,241))
    );
    }
}