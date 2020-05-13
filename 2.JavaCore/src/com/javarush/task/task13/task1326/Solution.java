package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        String line;
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(fileInputStream));
        ArrayList <Integer> arr = new ArrayList<>();
        while ((line = fileReader.readLine()) != null) {
            Integer i = Integer.parseInt(line);
            if (i%2==0) {
                arr.add(i);
            }
        }
        Collections.sort(arr);
        for (Integer i:arr
             ) {
            System.out.println(i);
        }
        reader.close();
        fileReader.close();
    }
}
