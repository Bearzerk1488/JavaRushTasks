package com.javarush.task.task13.task1318;

/* 
Чтение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        InputStream fileInputStream = new FileInputStream(fileName);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        while (bufferedInputStream.available() >0){
            char c = (char)bufferedInputStream.read();
            System.out.print(c);
        }
        fileInputStream.close();
        bufferedInputStream.close();
        reader.close();
    }
}