package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(args[1]));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(args[2]));
        byte[] buffer = new byte[bufferedInputStream.available()];
        bufferedInputStream.read(buffer, 0, buffer.length);
        if (args[0].equals("-e")) {
            for (int i = 0; i < buffer.length; i++) {
                buffer[i]++;
            }
        } else if (args[0].equals("-d")) {
            for (int i = 0; i < buffer.length; i++) {
                buffer[i]--;
            }
        }
        bufferedOutputStream.write(buffer);
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
