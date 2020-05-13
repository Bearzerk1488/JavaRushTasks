package com.javarush.task.task18.task1801;

/* 
Максимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int bigest = 0;
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            //System.out.println(data);
            if (bigest < data) bigest = data;
        }
        fileInputStream.close();
        System.out.println(bigest);

    }
}
