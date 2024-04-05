import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class Problem10Test {

    @Test
    public void testParallelLists() {
        assertTrue(Problem10.areParallelLists(Arrays.asList(5, 10, 15, 20), Arrays.asList(20, 40, 60, 80)));
    }

    @Test
    public void testNonParallelLists() {
        assertFalse(Problem10.areParallelLists(Arrays.asList(5, 10, 15, 20), Arrays.asList(20, 41, 60, 80)));
    }

    @Test
    public void testDifferentSizes() {
        assertFalse(Problem10.areParallelLists(Arrays.asList(5, 10, 15), Arrays.asList(20, 40, 60, 80)));
    }

    @Test
    public void testEmptyLists() {
        assertFalse(Problem10.areParallelLists(Arrays.asList(), Arrays.asList()));
    }

    @Test
    public void testZeroElements() {
        assertTrue(Problem10.areParallelLists(Arrays.asList(0, 0, 0), Arrays.asList(0, 0, 0)));
    }

    @Test
    public void testOneZeroAndOneNonZeroElement() {
        assertFalse(Problem10.areParallelLists(Arrays.asList(0), Arrays.asList(10)));
    }
}
