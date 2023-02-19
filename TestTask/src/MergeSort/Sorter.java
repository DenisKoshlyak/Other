package MergeSort;

import java.util.*;

public class Sorter {
    private WriterToFile writer;
    private List<ReaderFromFile> inputFiles = new ArrayList<>();
    private final int MOST_BIGGER_VALUE = 1999999999;
    private int count = Main.countFiles;
    private int writerValue = -1;
    private int temp;
    private int mark;

    public void sort() {
        if(!Main.stringData && !Main.notDataType) {
            while(true) {
                writerValue = inputFiles.get(0).readInteger();
                inputFiles.get(0).flagIsTrue();
                mark = 0;
                writerValue = sortInteger(temp, mark);
                if(writerValue == MOST_BIGGER_VALUE)
                    break;
                writer.writeInt(writerValue);
            }
            System.out.println("Success!");
        }
        else if(Main.stringData){
            System.out.println("Success!");
        }
        else
            System.out.println("Specify the input data type");
    }

    private int sortInteger(int temp, int mark){
        for (int i = 1; i < count; i++) {
            temp = inputFiles.get(i).readInteger();
            if (temp < writerValue) {
                writerValue = temp;
                inputFiles.get(mark).flagIsFalse();
                inputFiles.get(i).flagIsTrue();
                mark = i;
            } else {
                inputFiles.get(mark).flagIsTrue();
                inputFiles.get(i).flagIsFalse();
            }
        }
        return writerValue;
    }
     public Sorter setWriter(WriterToFile writer){
        this.writer = writer;
        return this;
     }

     public Sorter setInputFiles(List<ReaderFromFile> inputFiles) {
        this.inputFiles = inputFiles;
        return this;
     }
}
