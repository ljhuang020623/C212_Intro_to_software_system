import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {

    @org.junit.jupiter.api.Test
    void countStr() {
        assertAll(
                () -> assertEquals(4, Problem1.countStr("strstrstrstr")),
                () -> assertEquals(3, Problem1.countStr("strstrstrtsr")),
                () -> assertEquals(0, Problem1.countStr("apiejoejewr")),
                () -> assertEquals(2, Problem1.countStr("kihewrhhstrstr"))
        );
    }
}