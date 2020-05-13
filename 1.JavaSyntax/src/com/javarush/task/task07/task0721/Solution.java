package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mass = new int[20];
        for (int i = 0; i < 20; i++) mass[i] = Integer.parseInt(reader.readLine());
        int maximum = mass[0];
        int minimum = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (minimum >= mass[i]) minimum = mass[i];
            if (maximum <= mass[i]) maximum = mass[i];
        }

        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);
    }
}
