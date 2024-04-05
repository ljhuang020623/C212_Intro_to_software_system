import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MiniStackTest {
    private MiniStack<Integer> stack;

    @BeforeEach
    void setUp() {
        stack = new MiniStack<>();
    }

    @Test
    void add() {
        assertTrue(stack.size() == 0, "Stack should be empty initially");
        stack.add(10);
        assertEquals(1, stack.size(), "Stack size should be 1 after one add");
        assertEquals(10, stack.peek(), "Peek should return the last added element");
    }

    @Test
    void peek() {
        assertThrows(EmptyStackException.class, stack::peek, "Peeking from an empty stack should throw EmptyStackException");

        stack.add(20);
        int element = stack.peek();
        assertEquals(20, element, "Peek should return the top element without removing it");
        assertEquals(1, stack.size(), "Stack size should remain unchanged after peek");
    }

    @Test
    void pop() {
        assertThrows(EmptyStackException.class, stack::pop, "Popping from an empty stack should throw EmptyStackException");

        stack.add(30);
        stack.add(40);
        assertEquals(40, stack.pop(), "Pop should return the last added element");
        assertEquals(1, stack.size(), "Stack size should decrease by 1 after pop");
    }

    @Test
    void size() {
        assertEquals(0, stack.size(), "Newly created stack should have size 0");
        stack.add(50);
        stack.add(60);
        assertEquals(2, stack.size(), "Stack size should reflect the number of added elements");
    }

    @Test
    void testToString() {
        assertEquals("", stack.toString(), "Newly created stack should return an empty string");
        stack.add(70);
        stack.add(80);
        assertEquals("80, 70", stack.toString(), "toString should return elements in LIFO order");
    }
}

