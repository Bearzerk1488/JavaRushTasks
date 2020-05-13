package com.javarush.task.task16.task1630;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Solution {

    public static String firstFileName;
    public static String secondFileName;

    static {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        } catch (IOException ex) {
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {

        String fileName;
        List<String> list = new ArrayList();
        String result = "";

        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            for(int i = 0; i< list.size(); i++){
                result = result + " " + list.get(i);
            }
            return result;
        }

        @Override
        public void run() {
            BufferedReader fileReader = null;

            String add = null;
            try {
                File myFile = new File(fileName);
                fileReader = new BufferedReader(new FileReader(myFile));
                while((add = fileReader.readLine()) != null){
                    list.add(add);
                }


            } catch (FileNotFoundException ex) {
            } catch (IOException ex) {
            } finally {
                try {
                    fileReader.close();
                } catch (IOException ex) {
                }
            }

        }

    }
}