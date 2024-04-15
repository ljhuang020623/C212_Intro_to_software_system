package edu.iu.c212.utils;

import edu.iu.c212.models.Item;
import edu.iu.c212.models.Staff;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtils {
    private static File inputFile = new File("../resources/input.txt");
    private static File outputFile = new File("../resources/output.txt");
    private static final File inventoryFile = new File("ProjectStarterCode/ProjectStarterCode/src/edu/iu/c212/resources/inventory.txt");
    private static final File staffFile = new File("../resources/staff.txt");
    private static File staffAvailabilityFile = new File("../resources/staff_availability_IN.txt");
    private static File shiftSchedulesFile = new File("../resources/shift_schedules_IN.txt");
    private static File storeScheduleFile = new File("../resources/store_schedule_OUT.txt");

    public static List<Item> readInventoryFromFile() throws IOException {
        System.out.println(inventoryFile.getPath() + " " + inventoryFile.exists());
        List<Item> items = new ArrayList<>();
        try {
            // Ensure the file exists to avoid FileNotFoundException
            if (!inventoryFile.exists()) {
                throw new IOException("The inventory file does not exist.");
            }
            Scanner in = new Scanner(inventoryFile);

            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] parts = line.split(",");

                String name = parts[0];
                int cost = Integer.parseInt(parts[1]);
                int quantity = Integer.parseInt(parts[2]);
                int aisleNum = Integer.parseInt(parts[3]);

                Item item = new Item(name, cost, quantity, aisleNum);
                items.add(item);
            }
            in.close();
        } catch (IOException e){
            System.out.println("reading error");
        }
        return items;
    }

    public static List<Staff> readStaffFromFile() throws IOException {
        if(!staffFile.exists()){throw new IOException("The staff file does not exist.");}

        List<Staff> staffs = new ArrayList<>();
        Scanner in = new Scanner(staffFile);

        while(in.hasNextLine()){
            String line = in.nextLine();
            String[] parts = line.split(" ", 5);

            String name = parts[0] + " " + parts[1];
            int age = Integer.parseInt(parts[2]);

            // Role as full name
            char character = parts[3].charAt(0);
            String role = "";
            if(character == 'C'){
                role = "Cashier";
            }else if(character == 'M'){
                role = "Manager";
            }else if(character == 'G'){
                role = "Gardener";
            }

            String av = parts[4];

            Staff staff = new Staff(name, age, role, av);
            staffs.add(staff);
        }
        in.close();
        return staffs;
    }

    public static void writeInventoryToFile(List<Item> items) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(inventoryFile));
            for (Item item : items) {
                writer.println(item.getName() + "," + item.getPrice() + "," + item.getQuantity() + "," + item.getAisle());
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Writing inventory file error");
        }
    }

    public static void writeStaffToFile(List<Staff> employees) {
//        try{
//            PrintWriter w = new PrintWriter(new FileWriter());
//
//        } catch (IOException e){
//            System.out.println("writeStafftoFile error");
////            Needs System.exit
//        }
    }

    public static List<String[]> readCommandsFromFile() throws IOException {
        Scanner scanner = new Scanner(inputFile);
        List<String[]> commands = new ArrayList<String[]>();
        while(scanner.hasNextLine()){

            String line = scanner.nextLine();
            List<String> parts = new ArrayList<>();
            boolean inQuotes = false;
            StringBuilder buffer = new StringBuilder();

            for(char c : line.toCharArray()){
                if(c == '\''){
                    inQuotes = !inQuotes;
                }else if(c == ' ' && !inQuotes){
                    if(buffer.length() > 1){
                        parts.add(buffer.toString());
                        buffer = new StringBuilder();
                    }
                }else{
                    buffer.append(c);
                }
            }
            if(buffer.length() > 1){
                parts.add(buffer.toString());
            }
            commands.add(parts.toArray(new String[0]));
        }
        scanner.close();
        return commands;
    }

    public static void writeStoreScheduleToFile(List<String> lines) {
        // TODO
    }

    public static void writeLineToOutputFile(String line) {
        // TODO
    }

}
