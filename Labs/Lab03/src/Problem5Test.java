import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem5Test {

    @Test
    void hyperfactorial() {
        assertAll(
                () -> assertEquals(86400000, Problem5.hyperfactorial(5)),
                () -> assertEquals(4031078400000L, Problem5.hyperfactorial(6)),
                () -> assertEquals(1, Problem5.hyperfactorial(1)),
                () -> assertEquals(0, Problem5.hyperfactorial(0))
        );
    }

    @Test
    void hyperfactorialTR() {
        assertAll(
                () -> assertEquals(86400000, Problem5.hyperfactorial(5)),
                () -> assertEquals(4031078400000L, Problem5.hyperfactorial(6)),
                () -> assertEquals(1, Problem5.hyperfactorial(1)),
                () -> assertEquals(0, Problem5.hyperfactorial(0))
        );
    }
}