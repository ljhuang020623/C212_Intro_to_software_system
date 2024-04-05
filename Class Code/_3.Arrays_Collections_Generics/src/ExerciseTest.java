import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseTest {

    @org.junit.jupiter.api.Test
    void operate() {
        assertAll(
                () -> assertArrayEquals(new int[]{1, 4, 1, 16, 1, 36}, Exercise.operate(new int[]{1, 2, 3, 4, 5, 6})),
                () -> assertArrayEquals(new int[]{10, 40, 10, 160, 10}, Exercise.operate(new int[]{10, 20, 30, 40, 50})),
                () -> assertArrayEquals(new int[]{7}, Exercise.operate(new int[]{7}))
        );
    }
    @Test
    void containsOnlyPrime() {
        assertAll(
                () -> assertFalse(Exercise.containsOnlyPrime(new int[]{1,1,1,1,1,1,1,1,1})),
                () -> assertTrue(Exercise.containsOnlyPrime(new int[]{17,19,23,29})),
                () -> assertFalse(Exercise.containsOnlyPrime(new int[]{0,0,0,0,0,0,0,0,0})),
                () -> assertFalse(Exercise.containsOnlyPrime(new int[]{2,100,51,71,23}))
        );
    }

    @Test
    void accSum() {
        assertAll(
                () -> assertArrayEquals(new int[]{1,3,6,10,15,21}, Exercise.accSum(new int[]{1, 2, 3, 4, 5, 6})),
                () -> assertArrayEquals(new int[]{10,30,60,100,150}, Exercise.accSum(new int[]{10, 20, 30, 40, 50})),
                () -> assertArrayEquals(new int[]{7,7,6,4,54,154}, Exercise.accSum(new int[]{7,0,-1,-2,50,100}))
        );
    }
}