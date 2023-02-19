package MergeSort;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReaderFromFile {
    private int currentItemOfFlow = -1;
    private Scanner scanner;
    private File inputFile;
    private boolean flag = true;
    private final int MOST_BIGGER_VALUE = 1999999999;

    ReaderFromFile(File inputFile) {
        try {
            scanner = new Scanner(inputFile);
        } catch (IOException e) {
            System.out.println("File not read");
        }
        this.inputFile = inputFile;
        flag = true;
    }

    public int readInteger() {
        if (flag && scanner.hasNextInt()) {
            currentItemOfFlow = scanner.nextInt();
        }
        else if(!flag){
            return currentItemOfFlow;
        }
        else if(!scanner.hasNextInt()){
            currentItemOfFlow = MOST_BIGGER_VALUE;
        }
        return currentItemOfFlow;
    }

    public void flagIsTrue(){
        this.flag = true;
    }

    public void flagIsFalse(){
        this.flag = false;
    }
}
