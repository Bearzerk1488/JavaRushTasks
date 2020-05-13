package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arrayBig = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) arrayBig[i] = Integer.parseInt(reader.readLine());
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        for (int i = 0; i < 10; i++) {
            array1[i] = arrayBig[i];
            array2[i] = arrayBig[10 + i];
        }
        for (int i = 0; i < array2.length; i++) System.out.println(array2[i]);
    }
}
