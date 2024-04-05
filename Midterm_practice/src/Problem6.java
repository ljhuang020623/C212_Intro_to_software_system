import java.util.PriorityQueue;

public class Problem6 {
    public static int[] findKLargest(int[] arr, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int[] result = new int[k];
        for(int num : arr){
            minHeap.offer(num);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        for(int n = 0; n < k; n++){
            result[n] = minHeap.poll();
        }

        return result;
    }
}
