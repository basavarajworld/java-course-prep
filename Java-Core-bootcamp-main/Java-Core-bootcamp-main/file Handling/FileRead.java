import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Reads the contents of a file and prints each line to the console.
 *
 * @param args The command line arguments
 */
public class FileRead {
    public static void main(String[] args) {
        /**
         * Creates a new File object with the specified file path.
         *
         * @param filePath The path of the file
         * @return A new File object representing the file
         */
        File myFile = new File("file1.txt");
        try {
            /**
             * Reads the contents of a file using a Scanner and prints each line to the
             * console.
             *
             * @param myFile The file to read from
             */
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
            /**
             * Handles the FileNotFoundException by printing the stack trace.
             *
             * @param e The FileNotFoundException that was caught
             */
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}