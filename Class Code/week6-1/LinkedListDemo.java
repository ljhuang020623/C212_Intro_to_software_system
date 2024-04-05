import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> movies = new LinkedList<>();

        movies.add("a new hope");
        movies.add("the empire strikes back");
        movies.add("return of the jedi");

        System.out.println("printing the list using for each loop");
        for (String m: movies) {
            System.out.println(m);
        }

        System.out.println("printing the list using for  loop");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println(movies.get(i));
        }

        String movie = movies.remove();

        System.out.println("printing the list after removing the first item");
        for (String m: movies) {
            System.out.println(m);
        }

        System.out.println("printing the list using iterator");
        ListIterator<String> iter = movies.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }


    }

}
