import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem1Test {

    @Test
    void testProblem1() {
        List<String> list1 = Arrays.asList("Hello", "World");
        List<String> list2 = Arrays.asList("Java", "Stream", "API");
        List<String> list3 = Collections.singletonList("SingleElement");
        List<String> list4 = Collections.emptyList();

        // Execute all assertions
        assertAll("conjoin tests",
                () -> assertEquals("Hello,World", Problem1.conjoin(Arrays.asList("Hello", "World")), "List with two elements failed"),
                () -> assertEquals("Java,Stream,API", Problem1.conjoin(Arrays.asList("Java", "Stream", "API")), "List with three elements failed"),
                () -> assertEquals("SingleElement", Problem1.conjoin(Collections.singletonList("SingleElement")), "Single element list failed"),
                () -> assertEquals("", Problem1.conjoin(Collections.emptyList()), "Empty list failed")
        );
    }

}