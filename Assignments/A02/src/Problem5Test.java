import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem5Test {

    @Test
    void compareTo() {
        assertEquals(0, Problem5.compareTo("hello", "hello"));
        assertEquals(-1, Problem5.compareTo("hello", "helloo"));
        assertEquals(1, Problem5.compareTo("helloo", "hello"));
        assertEquals(-1, Problem5.compareTo("abc", "bcd"));
        assertEquals(1, Problem5.compareTo("bcd", "abc"));
        assertEquals(0, Problem5.compareTo("", ""));
        assertEquals(1, Problem5.compareTo("a", ""));
        assertEquals(-1, Problem5.compareTo("", "a"));
        assertEquals(-1, Problem5.compareTo("aaa", "bbb"));
        assertEquals(1, Problem5.compareTo("bbb", "aaa"));
    }
}