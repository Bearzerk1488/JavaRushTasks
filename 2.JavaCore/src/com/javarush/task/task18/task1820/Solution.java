package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = reader.readLine();
        String secondFile = reader.readLine();
        reader.close();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(firstFile));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(secondFile));
        int i;
        String s = "";
        while ((i = bufferedInputStream.read()) != -1) {
            s += (char) i;
            if (i == 32 || bufferedInputStream.available()==0) {
                double d = Double.parseDouble(s);
                long j = Math.round(d);
                String result = j + " ";
                bufferedOutputStream.write(result.getBytes());
                s = "";
            }
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
