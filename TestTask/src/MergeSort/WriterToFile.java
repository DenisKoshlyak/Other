package MergeSort;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterToFile{
    private File outFile;

    public WriterToFile(String fileOutName){
        outFile = new File(fileOutName);
    }

    public void writeInt(int item) {
        if (outFile == null) {
            System.out.println("File not found");
            return;
        }
        try (FileWriter writer = new FileWriter(outFile, true)) {
            writer.write(item + "\n");
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
