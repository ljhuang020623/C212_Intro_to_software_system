import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem2Test {

    @Test
    void testProblem2() {
        assertAll("Testing addYRemoveYY method",
                () -> {
                    List<String> input1 = Arrays.asList("a", "b", "cyy");
                    List<String> expected1 = Arrays.asList("ay", "by");
                    assertEquals(expected1, Problem2.addYRemoveYY(input1), "Failed on input1");
                },
                () -> {
                    List<String> input2 = Arrays.asList("hey", "yay", "okay", "yy");
                    List<String> expected2 = Arrays.asList("heyy", "yayy", "okayy"); // "yy" + "y" = "yyy" should be filtered out
                    assertEquals(expected2, Problem2.addYRemoveYY(input2), "Failed on input2");
                },
                () -> {
                    List<String> input3 = Arrays.asList("", "y", "yy", "yyy");
                    List<String> expected3 = Arrays.asList("y", "yyyy"); // Only strings that become "yy" after addition are removed
                    assertEquals(expected3, Problem2.addYRemoveYY(input3), "Failed on input3");
                }
        );
    }
}
