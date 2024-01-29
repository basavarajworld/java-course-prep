import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This class demonstrates how to write content to a file using FileWriter.
 */
public class FileWrite {
    public static void main(String[] args) {
        try {
            /**
             * Creates a new FileWriter object to write to the file "file1.txt".
             *
             * @param fileName The name of the file to write to
             * @throws IOException If an I/O error occurs
             */
            FileWriter fileWriter = new FileWriter("file1.txt");
            /**
             * Writes a string to a file and closes the file writer.
             *
             * @param text The string to write to the file
             * @throws IOException If an I/O error occurs while writing to the file
             */
            fileWriter.write(
                    "DevOps is a cultural and professional movement aimed at bridging the gap between software development (Dev) and IT operations (Ops).\n The aim is to ensure high-quality software delivery with high business value while reducing time to market and increasing operational efficiency.");
            /**
             * Closes the file writer and handles any IOException that may occur.
             * 
             * @throws IOException if an error occurs while closing the file writer
             */
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
