package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int year = Integer.parseInt(s);
        if (year % 400 == 0) {
            int y = year %400;
            int x = 366;
            System.out.println("количество дней в году: " + x);
        }
        else if (year%100 == 0){
            int x = 365;
            System.out.println("количество дней в году: " + x);
        }
        else if (year%4 ==0){
            int x = 366;
            System.out.println("количество дней в году: " + x);
        }
        else {
            int x =  365;
            System.out.println("количество дней в году: " + x);
        }
        reader.close();
    }
}