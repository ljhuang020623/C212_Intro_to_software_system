import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem6Test {

    @Test
    void strSumNums() {
        assertAll(
                () -> assertEquals(100, Problem6.strSumNums("hello50how20are30you?"), "Summing numbers in 'hello50how20are30you?' should return 100"),
                () -> assertEquals(10, Problem6.strSumNums("t1h1i1s1i1s1e1a1s1y1!"), "Summing numbers in 't1h1i1s1i1s1e1a1s1y1!' should return 10"),
                () -> assertEquals(0, Problem6.strSumNums("there are no numbers :("), "Summing numbers in 'there are no numbers :(' should return 0"),
                () -> assertEquals(0, Problem6.strSumNums("still 0 just 0 zero0!"), "Summing numbers in 'still 0 just 0 zero0!' should return 0"),
                () -> assertEquals(500000, Problem6.strSumNums("500000"), "Summing numbers in '500000' should return 500000")
        );
    }
}