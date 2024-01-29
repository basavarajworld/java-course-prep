import java.io.File;

/**
 * A class that demonstrates how to delete a file.
 */
public class FileDelete {
    public static void main(String[] args) {
        /**
         * Creates a new File object with the specified file path.
         *
         * @param filePath The path of the file
         * @return A new File object representing the file
         */
        File myFile = new File("file1.txt");
        /**
         * Deletes a file and prints a message indicating whether the deletion was
         * successful or not.
         *
         * @param myFile The file to be deleted
         */
        if (myFile.delete()) {
            System.out.println("I have deleted: " + myFile.getName());
        } else {
            System.out.println("Some problem occurred while deleting the file");
        }
    }
}
