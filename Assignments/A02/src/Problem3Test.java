import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {

    @Test
    void collatz() {
        assertAll(
                () -> assertEquals("1", Problem3.collatz(1)),
                () -> assertEquals("2,1", Problem3.collatz(2)),
                () -> assertEquals("3,10,5,16,8,4,2,1", Problem3.collatz(3)),
                () -> assertEquals("4,2,1", Problem3.collatz(4)),
                () -> assertEquals("5,16,8,4,2,1", Problem3.collatz(5)),
                () -> assertEquals("6,3,10,5,16,8,4,2,1", Problem3.collatz(6)),
                () -> assertEquals("7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1", Problem3.collatz(7)),
                () -> assertEquals("9,28,14,7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1", Problem3.collatz(9)),
                () -> assertEquals("10,5,16,8,4,2,1", Problem3.collatz(10)),
                () -> assertEquals("13,40,20,10,5,16,8,4,2,1", Problem3.collatz(13))
        );
    }

    @Test
    void collatzTR() {
        assertAll(
                () -> assertEquals("1", Problem3.collatzTR(1)),
                () -> assertEquals("2,1", Problem3.collatzTR(2)),
                () -> assertEquals("3,10,5,16,8,4,2,1", Problem3.collatzTR(3)),
                () -> assertEquals("4,2,1", Problem3.collatzTR(4)),
                () -> assertEquals("5,16,8,4,2,1", Problem3.collatzTR(5)),
                () -> assertEquals("6,3,10,5,16,8,4,2,1", Problem3.collatzTR(6)),
                () -> assertEquals("7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1", Problem3.collatzTR(7)),
                () -> assertEquals("9,28,14,7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1", Problem3.collatzTR(9)),
                () -> assertEquals("10,5,16,8,4,2,1", Problem3.collatzTR(10)),
                () -> assertEquals("13,40,20,10,5,16,8,4,2,1", Problem3.collatzTR(13))
        );
    }

    @Test
    void collatzLoop() {
        assertAll(
                () -> assertEquals("1", Problem3.collatzLoop(1)),
                () -> assertEquals("2,1", Problem3.collatzLoop(2)),
                () -> assertEquals("3,10,5,16,8,4,2,1", Problem3.collatzLoop(3)),
                () -> assertEquals("4,2,1", Problem3.collatzLoop(4)),
                () -> assertEquals("5,16,8,4,2,1", Problem3.collatzLoop(5)),
                () -> assertEquals("6,3,10,5,16,8,4,2,1", Problem3.collatzLoop(6)),
                () -> assertEquals("7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1", Problem3.collatzLoop(7)),
                () -> assertEquals("9,28,14,7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1", Problem3.collatzLoop(9)),
                () -> assertEquals("10,5,16,8,4,2,1", Problem3.collatzLoop(10)),
                () -> assertEquals("13,40,20,10,5,16,8,4,2,1", Problem3.collatzLoop(13))
        );
    }
}