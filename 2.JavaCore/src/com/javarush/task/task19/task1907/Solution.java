package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileReader fileReader = new FileReader(fileName);
        int count = 0;
        BufferedReader reader1 = new BufferedReader(fileReader);
        while (reader1.ready()){
            for (String s: reader1.readLine().split("\\W")
                 ) {
                if (s.equals("world")) count++;
            }
        }
        fileReader.close();
        reader1.close();
        System.out.println(count);
    }
}
