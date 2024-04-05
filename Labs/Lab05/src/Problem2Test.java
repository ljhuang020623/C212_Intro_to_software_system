import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem2Test {

    @Test
    void sumNasty() {
        assertAll(
                () -> assertEquals(9.0, Problem2.sumNasty(new ArrayList<>(Arrays.asList(8, 7, 11, 9, 12, 10)))),
                () -> assertEquals(109.5, Problem2.sumNasty(new ArrayList<>(Arrays.asList(120, 99, 9)))),
                () -> assertEquals(0.0, Problem2.sumNasty(new ArrayList<>(List.of()))),
                () -> assertEquals(0.0, Problem2.sumNasty(new ArrayList<>(List.of(9))))
        );
    }
}