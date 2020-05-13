package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        int  count =0;
        int i;
        while ((i=bufferedInputStream.read())!=-1){
            if (i >64 && i <91 || i > 96 && i < 123){
                count ++;
            }
        }
        bufferedInputStream.close();
        fileInputStream.close();
        System.out.println(count);
    }
}
