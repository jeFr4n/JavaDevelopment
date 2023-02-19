package FileHandling;

import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors

/**
 * @author jefr4n
 * @version 1.0, 2023/02/19
 */

public class WriteToFile {

    private final static String path = "src/FileHandling/Files/";
    private final static String fileName = "filename.txt";

    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter(path + fileName);
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
