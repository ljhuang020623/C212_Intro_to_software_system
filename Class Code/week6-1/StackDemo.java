import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("a new hope");
        stack.push("the empire strikes back");
        stack.push("return of the jedi");

        for (int i = 0; i < stack.size(); i++) {
            System.out.println(i + " " + stack.get(i));
        }

        System.out.println(stack.pop());
    }
}
