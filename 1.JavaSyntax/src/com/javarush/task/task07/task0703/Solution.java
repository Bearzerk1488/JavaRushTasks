package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] list = new String[10];
        int[] array = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) list[i] = reader.readLine();
        for (int i = 0; i < list.length; i++) array[i] = list[i].length();
        for (int i = 0; i < array.length; i++) System.out.println(array[i]);
    }
}
