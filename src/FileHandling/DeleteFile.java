package FileHandling;

import java.io.File; // Import the File class

/**
 * @author jefr4n
 * @version 1.0, 2023/02/19
 */

public class DeleteFile {

private final static String path = "src/FileHandling/Files/";
private final static String fileName = "filename.txt";

    public static void main(String[] args) {
        File myObj = new File(path + fileName);
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
