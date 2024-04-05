import java.util.HashSet;
import java.util.Scanner;

public class GuestList {


    public static void main(String[] args) {

        HashSet<String> guests = new HashSet<>();

        guests.add("clint eastwood");
        guests.add("roger waters");
        guests.add("mark hammill");
        guests.add("james hetfield");
        guests.add("david gilmore");

        Scanner in = new Scanner(System.in);
        System.out.println("enter your name");
        String name = in.nextLine();

        if(guests.contains(name))
            System.out.println("you're in");
        else
            System.out.println("you're out");



    }
}
