import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class Problem9Test {

    @Test
    public void testStringifyListOfIntegers() {
        assertEquals("1,2,3", Problem9.stringifyList(Arrays.asList(1, 2, 3)));
    }

    @Test
    public void testStringifyListOfStrings() {
        assertEquals("Hello,World,Test", Problem9.stringifyList(Arrays.asList("Hello", "World", "Test")));
    }

    @Test
    public void testStringifyListOfDoubles() {
        assertEquals("1.1,2.2,3.3", Problem9.stringifyList(Arrays.asList(1.1, 2.2, 3.3)));
    }

    @Test
    public void testStringifyEmptyList() {
        assertEquals("", Problem9.stringifyList(Arrays.asList()));
    }

    @Test
    public void testStringifyListOfMixedTypes() {
        assertEquals("1,Hello,2.2", Problem9.stringifyList(Arrays.asList(1, "Hello", 2.2)));
    }
}
