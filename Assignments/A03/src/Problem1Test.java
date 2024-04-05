import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem1Test {

    @Test
    void testFizzbuzz() {
        // Test from 1 to 12
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz"}, Problem1.fizzBuzz(1, 12));

        // Test from 1 to 5
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz"}, Problem1.fizzBuzz(1, 5));

        // Test from 15 to 21
        assertArrayEquals(new String[]{"FizzBuzz", "16", "17", "Fizz", "19", "Buzz", "Fizz"}, Problem1.fizzBuzz(15, 21));

        // Test a single number for "Fizz" (3)
        assertArrayEquals(new String[]{"Fizz"}, Problem1.fizzBuzz(3, 3));

        // Test a single number for "Buzz" (5)
        assertArrayEquals(new String[]{"Buzz"}, Problem1.fizzBuzz(5, 5));

        // Test a single number for "FizzBuzz" (15)
        assertArrayEquals(new String[]{"FizzBuzz"}, Problem1.fizzBuzz(15, 15));

        // Test with negative and positive range
        assertArrayEquals(new String[]{"Fizz", "-2", "-1", "FizzBuzz", "1", "2", "Fizz", "4", "Buzz"}, Problem1.fizzBuzz(-3, 5));

        // Test range without "Fizz" or "Buzz" (1, 2)
        assertArrayEquals(new String[]{"1", "2"}, Problem1.fizzBuzz(1, 2));
    }
}
