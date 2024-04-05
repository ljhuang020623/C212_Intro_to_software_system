import java.util.List;
import java.util.Stack;

public class Problem8 {

    private static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    private static double applyOperator(String operator, double op1, double op2) {
        switch (operator) {
            case "+":
                return op1 + op2;
            case "-":
                return op1 - op2;
            case "*":
                return op1 * op2;
            case "/":
                if (op2 == 0) throw new IllegalArgumentException("Division by zero.");
                return op1 / op2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }


    static double postfixEvaluator(List<String> l) {
        Stack<Double> stack = new Stack<>();

        for (String token : l) {
            if (isOperator(token)) {
                if (stack.size() < 2) throw new IllegalArgumentException("Invalid postfix expression.");
                double op2 = stack.pop();
                double op1 = stack.pop();
                double result = applyOperator(token, op1, op2);
                stack.push(result);
            } else {
                try {
                    stack.push(Double.parseDouble(token));
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Invalid token: " + token);
                }
            }
        }

        if (stack.size() != 1) throw new IllegalArgumentException("Invalid postfix expression.");
        return stack.pop();
    }
}
