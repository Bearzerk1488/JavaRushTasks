package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = reader.readLine();
        String secondFile = reader.readLine();
        String thirdFile = reader.readLine();
        reader.close();
        FileInputStream fileInputStream = new FileInputStream(firstFile);
        FileOutputStream fileOutputStream = new FileOutputStream(secondFile);
        FileOutputStream fileOutputStream1 = new FileOutputStream(thirdFile);
        byte [] firstBuffer = new byte[fileInputStream.available() / 2];
        byte [] secondBuffer = new byte[fileInputStream.available() - firstBuffer.length];
        fileInputStream.read(secondBuffer);
        fileOutputStream.write(secondBuffer);
        fileInputStream.read(firstBuffer);
        fileOutputStream1.write(firstBuffer);
        fileInputStream.close();
        fileOutputStream.close();
        fileOutputStream1.close();
    }
}
