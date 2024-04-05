public class GenericDemo {

    public static void printIntArray(int[] values){
        for (int v: values) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    public static <T> void printGenericArray(T[] values){
        for (T v: values) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    public static <T extends Number> double addNumbers(T no1, T no2){
        return no1.doubleValue() + no2.doubleValue();
    }

    public static void main(String[] args) {

        Integer[] a = {1, 2, 3 ,4, 5};
        String[] b = {"a", "b", "c"};

        //printIntArray(a);
        printGenericArray(a);
        printGenericArray(b);

    }
}
