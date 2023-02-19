package MergeSort;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static boolean stringData;
    static boolean notDataType = false;
    static boolean descendingSort = false;
    static int countFiles;
    public static List<ReaderFromFile> inputFiles = new ArrayList<>();
    public static WriterToFile writer;

    public static void main(String[] args) {
            new ParseInputData().parse(args);
            Sorter sorter = new Sorter()
                    .setWriter(writer)
                    .setInputFiles(inputFiles);
            sorter.sort();
    }
}