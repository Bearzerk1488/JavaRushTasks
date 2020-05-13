package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int count = 0;
        int testChar = 44;
        while (fileInputStream.available()>0){
            if(fileInputStream.read() == testChar)  count ++;
        }
        fileInputStream.close();
        System.out.println(count);
    }
}
