package edu.iu.c212;
import java.util.List;

import edu.iu.c212.models.Item;
import edu.iu.c212.models.Staff;
import edu.iu.c212.utils.FileUtils;
import java.io.IOException;




public interface IStore {

    public static List<Item> getItemsFromFile() {
        List<Item> item = null;
        try {
            item = FileUtils.readInventoryFromFile();
        } catch (IOException e) {
            System.exit(1);
        }
        return item;
    }


    public static List<Staff> getStaffFromFile(){
        List<Staff> staff = null;
        try {
            staff = FileUtils.readStaffFromFile();
        } catch (IOException e) {
            System.exit(1);
        }
        return staff;
    }

    public static void saveItemsFromFile(){
        try{
            List<Item> item = FileUtils.readInventoryFromFile();
            FileUtils.writeInventoryToFile(item);
        }catch(IOException e){
            System.exit(1);
        }
    }

    public static void saveStaffFromFile(){
        try {
            List<Staff> staff = FileUtils.readStaffFromFile();
            FileUtils.writeStaffToFile(staff);
        } catch (IOException e) {
            System.exit(1);
        }
    }
    public static void takeAction(){

    }


}
