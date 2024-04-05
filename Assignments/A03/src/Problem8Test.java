import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class Problem8Test {

    @Test
    public void testSimpleExpression() {
        List<String> expression = Arrays.asList("3", "4", "+");
        assertEquals(7.0, Problem8.postfixEvaluator(expression));
    }


    @Test
    public void testDivisionByZero() {
        List<String> expression = Arrays.asList("4", "0", "/");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Problem8.postfixEvaluator(expression));
        assertEquals("Division by zero.", exception.getMessage());
    }

    @Test
    public void testInvalidToken() {
        List<String> expression = Arrays.asList("4", "two", "+");
        assertThrows(IllegalArgumentException.class, () -> Problem8.postfixEvaluator(expression));
    }

    @Test
    public void testInvalidPostfixExpression() {
        List<String> expression = Arrays.asList("+", "3", "4");
        assertThrows(IllegalArgumentException.class, () -> Problem8.postfixEvaluator(expression));
    }

    @Test
    public void testSingleNumber() {
        List<String> expression = Arrays.asList("42");
        assertEquals(42.0, Problem8.postfixEvaluator(expression));
    }
}
