package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader nameReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = nameReader.readLine();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        nameReader.close();
        String s;
        while ((s=reader.readLine())!=null){
            char[]cbuf = s.toCharArray();
            for (int i = cbuf.length-1; i > -1; i--) {
                System.out.print(cbuf[i]);
            }
            System.out.println("");
        }
        reader.close();
    }
}
