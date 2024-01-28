package Week2_Core_Java.IO;

import java.io.*;

public class OutputStreamWriterExample {
    public static void main(String[] args) {
        String fileName = "output.txt";

        try (OutputStream outputStream = new FileOutputStream(fileName);
             Writer writer = new OutputStreamWriter(outputStream, "UTF-8")) {

            // Writing characters to the file using OutputStreamWriter
            writer.write("Hello, World!\n");
            writer.write("This is an example of OutputStreamWriter.");

            System.out.println("Data has been written to " + fileName);

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
