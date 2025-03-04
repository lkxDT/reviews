import java.io.*;
import java.nio.file.*;

public class SaveDateToFile {
    public static void main(String[] args) {
        if (args.length == 2) {
            String fileName = args[0];
            String date = args[1];
            try {
                DateChecker.checkDate(date);
                writeDate(fileName, date);
            
            } catch (IllegalArgumentException e) {
                System.out.println(date + " is not a valid Date");
            }
        } else {
        System.out.println("Too few arguments");
        }

    }

    public static void writeDate(String fileName, String date) {
        try {
            Files.writeString(Paths.get(fileName), date);
        } catch (IOException e) {
            System.out.println("An error occurred while writing the date to the file: " + e.getMessage());
        }
    }
    
}