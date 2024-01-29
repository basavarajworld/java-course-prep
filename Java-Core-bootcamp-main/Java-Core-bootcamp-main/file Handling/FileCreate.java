import java.io.File;
import java.io.IOException;

public class FileCreate {
    /**
     * Creates a new file with the given name if it does not already exist.
     * Prints a success message if the file is created successfully.
     * Prints the stack trace if an IOException occurs during the file creation
     * process.
     *
     * @param args The command line arguments
     */
    public static void main(String[] args) {

        /**
         * Creates a new File object with the specified file path.
         *
         * @param filePath The path of the file
         * @return A new File object representing the file
         */
        File myFile = new File("file1.txt");
        /**
         * Attempts to create a new file and prints a success message if successful.
         * If an IOException occurs during the file creation process, the exception is
         * printed.
         *
         * @param myFile The file to be created
         */
        try {
            /**
             * Creates a new file with the specified name.
             *
             * @return true if the file was successfully created, false otherwise
             * @throws IOException if an I/O error occurs while creating the file
             */
            myFile.createNewFile();
            System.out.println("File created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
