package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = reader.readLine();
        String secondFile = reader.readLine();
        reader.close();
        FileInputStream fileInputStream = new FileInputStream(firstFile);
        FileOutputStream fileOutputStream = new FileOutputStream(secondFile);
        ArrayList<Integer> arr = new ArrayList<>();

        while (fileInputStream.available() > 0) {
            arr.add(fileInputStream.read());
        }
        Collections.reverse(arr);
        fileInputStream.close();
        for (int i = 0; i < arr.size(); i++) {
            fileOutputStream.write(arr.get(i));
        }
        fileOutputStream.close();
    }
}
