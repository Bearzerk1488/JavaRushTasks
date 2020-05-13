package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = reader.readLine();
        String secondFile = reader.readLine();
        reader.close();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(firstFile));
        int i;
        byte[] arr = new byte[bufferedInputStream.available()];
        int count = 0;
        while ((i = bufferedInputStream.read()) != -1) {
            arr[count] = (byte) i;
            count++;
           // System.out.println(arr[count] + " " + i);
        }
        bufferedInputStream.close();
        BufferedInputStream bufferedInputStream1 = new BufferedInputStream(new FileInputStream(secondFile));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(firstFile));

        while ((i = bufferedInputStream1.read()) != -1) {
            bufferedOutputStream.write(i);
        }
        bufferedOutputStream.write(arr);
        bufferedInputStream1.close();
        bufferedOutputStream.close();
    }
}
