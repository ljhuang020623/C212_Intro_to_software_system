package edu.iu.c212;

import edu.iu.c212.models.Item;
import edu.iu.c212.models.Staff;
import edu.iu.c212.utils.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Store implements IStore{
    void takeAction() throws IOException {
        List<String[]> commandLine = FileUtils.readCommandsFromFile();
        switch(commandLine.get(0).toString()) {
            case "ADD":

                System.out.print(commandLine.get(0).toString() + "was added to inventory");
                break;
            case "COST":
                break;
            case "EXIT":
                break;
            case "FIND":
                break;
            case "FIRE":
                break;
            case "HIRE":
                break;
            case "PROMOTE":
                break;
            case "SAW":
                break;
            case "SCHEDULE":
                break;
            case "SELL":
                break;
            case "QUANTITY":
                break;
        }

    }

    public Store() throws IOException {
        takeAction();
    }
}
