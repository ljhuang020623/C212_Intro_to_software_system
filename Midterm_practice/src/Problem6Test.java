import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Problem6Test {

    @Test
    void findKLargest() {
            // Test Case 1
            int[] arr1 = {1, 5, 9, 10, 2, 4};
            int[] result1 = Problem6.findKLargest(arr1, 3);
            System.out.println("Test Case 1 Result: " + Arrays.toString(result1)); // Expected: [5, 9, 10]

            // Test Case 2
            int[] arr2 = {2, 6, 1, 10, 2, 10};
            int[] result2 = Problem6.findKLargest(arr2, 2);
            System.out.println("Test Case 2 Result: " + Arrays.toString(result2)); // Expected: [10, 10]
        }
}