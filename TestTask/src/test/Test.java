package test;

import MergeSort.WriterToFile;

public class Test {
    public static void main(String args[]){
        WriterToFile writer = new WriterToFile("in1.txt");
        for(int i = 0; i < 100; i = i + 3){
            writer.writeInt(i);
        }
        writer = new WriterToFile("in2.txt");
        for(int i = 1; i < 100; i = i + 3){
            writer.writeInt(i);
        }
        writer = new WriterToFile("in3.txt");
        for(int i = 2; i < 100; i = i + 3){
            writer.writeInt(i);
        }
        System.out.println("Success");
    }
}
