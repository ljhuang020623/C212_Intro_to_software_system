import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

class PQueueTest {

    @Test
    void enqueueAndSizeTest() {
        PQueue<Integer> queue = new PQueue<>();
        assertEquals(0, queue.size(), "New queue should be empty");

        queue = queue.enqueue(1);
        assertEquals(1, queue.size(), "Queue should have one element after enqueue");

        queue = queue.enqueue(2);
        assertEquals(2, queue.size(), "Queue should have two elements after second enqueue");
    }

    @Test
    void dequeueTest() {
        PQueue<String> queue = PQueue.of("a", "b", "c");
        assertEquals(3, queue.size(), "Queue should have three elements initially");

        queue = queue.dequeue();
        assertEquals(2, queue.size(), "Queue should have two elements after dequeue");

        queue = queue.dequeue();
        assertEquals(1, queue.size(), "Queue should have one element after second dequeue");
    }

    @Test
    void peekTest() {
        PQueue<Integer> queue = PQueue.of(1, 2, 3);
        assertEquals(1, queue.peek(), "Peek should return the first element");
    }

    @Test
    void emptyQueueTest() {
        PQueue<Double> queue = new PQueue<>();

        Exception exception = assertThrows(NoSuchElementException.class, queue::peek, "Peeking an empty queue should throw NoSuchElementException");
        assertTrue(exception.getMessage().contains("Queue is empty"), "Exception message should indicate that the queue is empty");
    }

    @Test
    void equalsTest() {
        PQueue<Integer> queue1 = PQueue.of(1, 2, 3);
        PQueue<Integer> queue2 = PQueue.of(1, 2, 3);
        PQueue<Integer> queue3 = PQueue.of(1, 2);

        assertEquals(queue1, queue2, "Queues with the same elements should be equal");
        assertNotEquals(queue1, queue3, "Queues with different elements should not be equal");
    }
}
