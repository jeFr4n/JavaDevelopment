package FileHandling;

import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

/**
 * @author jefr4n
 * @version 1.0, 2023/02/19
 */

public class ReadFile {

    private final static String path = "src/FileHandling/Files/";
    private final static String fileName = "filename.txt";

    public static void main(String[] args) {
        try {
            File myObj = new File(path + fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
