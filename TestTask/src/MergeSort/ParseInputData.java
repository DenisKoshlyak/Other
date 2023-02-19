package MergeSort;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParseInputData {
    void parse(String args[]) {
        int count = 0;
        if (args.length >= 3) {
            for (int i = 0; i < 2; i++) {
                if ("-a".equalsIgnoreCase(args[count]) || "-d".equalsIgnoreCase(args[count])) {
                    if ("-d".equalsIgnoreCase(args[count])) {
                        Main.descendingSort = true;
                    }
                    count++;
                }

                if ("-s".equalsIgnoreCase(args[count]) || "-i".equalsIgnoreCase(args[count])) {
                    if ("-s".equalsIgnoreCase(args[count++])) {
                        Main.stringData = true;
                    }
                }
                else Main.notDataType = true;
            }
            Main.writer = new WriterToFile(args[count++]);
            List<String> inputFileNames = new ArrayList<>(Arrays.asList(args).subList(count, args.length));
            Main.countFiles = inputFileNames.size();
            if (inputFileNames.size() < 1) {
                System.out.println("No input file.");
            } else {
                for (String fileName : inputFileNames) {
                    Main.inputFiles.add(new ReaderFromFile(new File(fileName)));
                }
            }
        }
        else {
            System.out.println("Not enough arguments!");
        }
    }
}
