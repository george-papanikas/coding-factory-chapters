package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class JULApp {

    public static void main(String[] args) {
        try {
            Scanner sc = getFileDescriptor("C:\\tmp\\test-15.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public static Scanner getFileDescriptor (String s) throws FileNotFoundException {
        File fd = new File(s);
        Logger logger = getLogger();

        try {
            return new Scanner(fd);
        } catch (FileNotFoundException e) {
            logger.severe("File not found" + e.getMessage());
            throw e;
        }
    }

    public static Logger getLogger() {
        Logger logger = Logger.getLogger(JULApp.class.getName());
        Handler fileHandler;

        try {
            fileHandler = new FileHandler("cf.log",true); // πάει στο φάκελο του project αν ήθελες να πάει κάπου αλλού θα το όριζες ως πχ /log/cf.log
            fileHandler.setFormatter (new SimpleFormatter());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        logger.addHandler(fileHandler);
        return logger; //συγκεκριμένος logger JULApp.class.getName() που γράφει στο cf.log με ένα SimpleFormatter
    }
}
