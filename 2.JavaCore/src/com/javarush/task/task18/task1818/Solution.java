package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = reader.readLine();
        String secondFile = reader.readLine();
        String thirdFile = reader.readLine();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(secondFile));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(firstFile));
        int i;
        while ((i = bufferedInputStream.read()) != -1) {
            bufferedOutputStream.write(i);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
        BufferedInputStream bufferedInputStream1 = new BufferedInputStream(new FileInputStream(thirdFile));
        BufferedOutputStream bufferedOutputStream1 = new BufferedOutputStream(new FileOutputStream(firstFile, true));
        while ((i = bufferedInputStream1.read())!=-1){
            bufferedOutputStream1.write(i);
        }
        bufferedInputStream1.close();
        bufferedOutputStream1.close();
    }
}
