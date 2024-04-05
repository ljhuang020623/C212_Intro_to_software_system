import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<>(Comparators.lengthComparator);

        pq.add("C");
        pq.add("AB");
        pq.add("A");
        pq.add("CDE");

        while(!pq.isEmpty())
            System.out.println(pq.remove());

    }
}
