package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = reader.readLine();
        String secondFileName = reader.readLine();
        reader.close();
        FileReader fileReader = new FileReader(firstFileName);
        FileWriter fileWriter = new FileWriter(secondFileName);
        while (fileReader.ready()) {
            int tmp = fileReader.read();
            int data = fileReader.read();
            fileWriter.write(data);
        }
        fileReader.close();
        fileWriter.close();
    }
}
