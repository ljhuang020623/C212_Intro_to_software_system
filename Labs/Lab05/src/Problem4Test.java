import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {

    @Test
    void shift() {
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("14", "11", "12", "13"));
        ArrayList<String> actual = Problem4.shift(new ArrayList<>(Arrays.asList("11", "12", "13", "14")), 1);
        assertEquals(expected, actual);

    }
}