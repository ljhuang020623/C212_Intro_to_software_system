import static org.junit.jupiter.api.Assertions.*;

class ExerciseTest {

    @org.junit.jupiter.api.Test
    void multTable() {
        assertAll(
                () -> assertEquals("1*1=1,1*2=2,1*3=3,1*4=4,1*5=5,1*6=6,2*1=2,2*2=4,2*3=6,2*4=8,2*5=10,2*6=12", Exercise.multTable(2,6)),
                () -> assertEquals("1*1=1", Exercise.multTable(1,1)),
                () -> assertEquals("1*1=1,1*2=2,1*3=3,2*1=2,2*2=4,2*3=6,3*1=3,3*2=6,3*3=9", Exercise.multTable(3,3))
        );
    }
}