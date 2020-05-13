package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double time = Double.parseDouble(reader.readLine());
        if (time % 5 >= 4  && time % 5 <= 5) System.out.println("красный");
        else if (time % 5 >= 3 && time % 5 <= 4) System.out.println("жёлтый");
        else System.out.println("зелёный");

    }
}