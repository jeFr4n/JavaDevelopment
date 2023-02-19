package FileHandling;

import java.io.File; // Import the File class
import java.io.IOException; // Import the IOException class to handle errors

/**
 * @author jefr4n
 * @version 1.0, 2023/02/19
 */

public class CreateFile {

    private final static String path = "src/FileHandling/Files/";
    private final static String fileName = "filename.txt";
    
    public static void main(String[] args) {

        try {
            File myObj = new File(path + fileName);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
