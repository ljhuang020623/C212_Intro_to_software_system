package edu.iu.c212.utils;

import edu.iu.c212.models.*;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.sql.Array;
import java.util.*;

import static edu.iu.c212.utils.FileUtils.*;
import static org.junit.jupiter.api.Assertions.*;

class FileUtilsTest {

    @Test
    void Test() throws IOException {
        List<Item> items = readInventoryFromFile();
        for(Item item : items){
            System.out.println(item.getName() + " " + item.getPrice() + " " + item.getQuantity() + " " + item.getAisle());
        }
    }



}