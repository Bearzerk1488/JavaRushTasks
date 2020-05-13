package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        int symbolCount=0;
        int spacesCount=0;
        int i;
        while ((i=bufferedInputStream.read())!=-1){
            symbolCount++;
            if (i==32) spacesCount++;
        }
        bufferedInputStream.close();
        double result = (double) spacesCount/symbolCount*100;
        System.out.printf("%.2f %n", result);
    }
}
