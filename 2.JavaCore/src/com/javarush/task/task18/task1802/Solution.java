package com.javarush.task.task18.task1802;

/* 
Минимальный байт
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
        int min =fileInputStream.read();
        while (fileInputStream.available() >0){
            int data = fileInputStream.read();
            if (min > data) min = data;
            //System.out.println(data);
        }
        fileInputStream.close();
        System.out.println(min);
    }
}
