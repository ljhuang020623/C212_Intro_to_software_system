import static org.junit.jupiter.api.Assertions.*;

class Problem2Test {

    @org.junit.jupiter.api.Test
    void grocery() {
        assertAll(
                () -> assertEquals(28.69, Problem2.grocery(9,6,1,9,2)),
                () -> assertEquals(31.53, Problem2.grocery(1,4,4,2,10)),
                () -> assertEquals(40.5, Problem2.grocery(5,10,0,7,8))
        );
    }
}