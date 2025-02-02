import java.io.*;

public class ReadDateFromFile {
    public static void main(String[] args) {
        if(args.length == 1) {
            String fileName = args[0];
            try {
                String date = getContent(fileName);
                DateChecker.checkDate(date);
                System.out.println(date);
                
            } catch (IOException e) {
                System.out.println("An error occurred while reading the date from the file: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("The date in the file is not valid");
            }
        } else {
            System.err.println("Too few arguments");
            System.err.println("Usage: java ReadDateFromFile <filename>");
        }
    }

    public static String getContent(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String date = reader.readLine();

            return date;
        } catch (FileNotFoundException e) {
            System.out.println("The file " + fileName + " was not found");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the date from the file: " + e.getMessage());
        }

        return null;
    }
}