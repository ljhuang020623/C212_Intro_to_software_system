import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {

    @Test
    void testProblem3() {
        assertAll("filterThenSquare",
                () -> {
                    List<Double> input1 = Arrays.asList(1.0, 2.0, 3.0, 4.0);
                    List<Double> expected1 = Arrays.asList(4.0, 16.0);
                    assertEquals(expected1, Problem3.filterThenSquare(input1), "Input1 failed");
                },
                () -> {
                    List<Double> input2 = Arrays.asList(5.0, 7.0, 9.0);
                    List<Double> expected2 = Collections.emptyList();
                    assertEquals(expected2, Problem3.filterThenSquare(input2), "Input2 failed");
                },
                () -> {
                    List<Double> input3 = Arrays.asList(-2.0, -4.0, -6.0);
                    List<Double> expected3 = Arrays.asList(4.0, 16.0, 36.0);
                    assertEquals(expected3, Problem3.filterThenSquare(input3), "Input3 failed");
                },
                () -> {
                    List<Double> input4 = Arrays.asList(2.5, 3.5, 4.5);
                    List<Double> expected4 = Collections.emptyList(); // Assuming the filter criteria strictly applies to whole numbers
                    assertEquals(expected4, Problem3.filterThenSquare(input4), "Input4 failed");
                }
        );
    }
}
