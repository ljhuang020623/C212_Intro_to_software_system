public class MiniStack<T> {
    private static final int INITIAL_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public MiniStack() {
        elements = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    @SuppressWarnings("unchecked")
    private void resizeIfNeeded() {
        if (size == elements.length) {
            Object[] newElements = new Object[2 * elements.length];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }

    public void add(T t) {
        resizeIfNeeded();
        elements[size++] = t;
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return (T) elements[size - 1];
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        T topElement = (T) elements[--size];
        elements[size] = null; // Prevent memory leaks
        return topElement;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = size - 1; i >= 0; i--) {
            sb.append(elements[i]);
            if (i > 0) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}

class EmptyStackException extends RuntimeException {
    public EmptyStackException() {
        super("Stack is empty");
    }
}
