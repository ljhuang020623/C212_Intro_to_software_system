import java.util.Arrays;

/**
 * This was not part of the lecture. It was written later to show how priorities are assigned
 * in a priority queue using the provided comparator
 */
public class PriorityCheck {

    public static void printArray(String[] values){
        for (String v: values) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        String[] values = {"C", "AB", "A", "CDE"};
        printArray(values);
        //Arrays.sort(values);
        //System.out.println("after sorting");
        //printArray(values);
        int sum = 0;
        int compTo = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                compTo = values[j].length() - values[i].length();
                sum += compTo;
                System.out.println(values[j] + " - " + values[i] + " : " + compTo);
            }
            System.out.println("priority for " + values[i] + " = " + sum);
            sum = 0;
        }

    }
}
