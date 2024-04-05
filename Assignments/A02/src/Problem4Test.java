import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {

    @Test
    void atoi() {
        assertAll(
                () -> assertEquals(43, Problem4.atoi("0043Hi"), "Parsing '0043Hi' should return 43"),
                () -> assertEquals(-42, Problem4.atoi("   -42"), "Parsing '   -42' should return -42"),
                () -> assertEquals(4193, Problem4.atoi("4193 with words"), "Parsing '4193 with words' should return 4193"),
                () -> assertEquals(0, Problem4.atoi("words and 987"), "Parsing 'words and 987' should return 0"),
                () -> assertEquals(0, Problem4.atoi("-91283472332"), "Parsing '-91283472332' should return 0 due to overflow"),
                () -> assertEquals(0, Problem4.atoi("+"), "Parsing '+' should return 0"),
                () -> assertEquals(0, Problem4.atoi("-"), "Parsing '-' should return 0"),
                () -> assertEquals(123, Problem4.atoi("123"), "Parsing '123' should return 123"),
                () -> assertEquals(0, Problem4.atoi("2147483648"), "Parsing '2147483648' should return 0 due to overflow"),
                () -> assertEquals(-2147483648, Problem4.atoi("-2147483648"), "Parsing '-2147483648' should correctly handle the minimum int value")
        );
    }
}