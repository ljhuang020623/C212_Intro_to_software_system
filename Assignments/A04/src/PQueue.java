import java.util.NoSuchElementException;

public class PQueue<T> {
    private static class Node<T> {
        final T value;
        Node<T> next;

        Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }

    private final Node<T> first;
    private final Node<T> last;
    private final int size;

    private PQueue(Node<T> first, Node<T> last, int size) {
        this.first = first;
        this.last = last;
        this.size = size;
    }

    public PQueue() {
        this(null, null, 0);
    }

    public PQueue<T> enqueue(T t) {
        Node<T> newNode = new Node<>(t, null);
        if (first == null) {
            return new PQueue<>(newNode, newNode, 1);
        } else {
            Node<T> newLast = new Node<>(last.value, newNode);
            Node<T> newFirst = copyWithNewLast(first, newLast);
            return new PQueue<>(newFirst, newNode, size + 1);
        }
    }

    private Node<T> copyWithNewLast(Node<T> node, Node<T> newLast) {
        if (node == last) {
            return newLast;
        } else {
            return new Node<>(node.value, copyWithNewLast(node.next, newLast));
        }
    }

    public PQueue<T> dequeue() {
        if(first == null){
            return new PQueue<>(null,null,0);
        }
        return new PQueue<>(first.next, last, size - 1);
    }

    public T peek() {
        if (first == null){
            return null;
        }
        return first.value;
    }

    @SafeVarargs
    public static <T> PQueue<T> of(T... vals) {
        if (vals.length == 0) {
            return new PQueue<>();
        }

        Node<T> head = new Node<>(vals[0], null); // Create the head node
        Node<T> current = head;
        for (int i = 1; i < vals.length; i++) {
            Node<T> newNode = new Node<>(vals[i], null);
            current.next = newNode; // Link the current node to the new node
            current = newNode; // Move current forward
        }

        return new PQueue<>(head, current, vals.length);
    }

    public int size() {
        return size;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof PQueue)) return false;
        PQueue<?> other = (PQueue<?>) obj;
        if (this.size != other.size) return false;

        Node<T> currentThis = this.first;
        Node<?> currentOther = other.first;
        while (currentThis != null) {
            if (!currentThis.value.equals(currentOther.value)) {
                return false;
            }
            currentThis = currentThis.next;
            currentOther = currentOther.next;
        }
        return true;
    }
}
