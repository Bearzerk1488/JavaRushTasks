package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int nlenght = number.length();
        int n = Integer.parseInt(number);
//        if (nlenght >= 1 && nlenght <= 3 && n >= 0)
//        {
//            if (n % 2 == 0) System.out.print("четное ");
//            else System.out.print("нечетное ");
//            if (nlenght == 1) System.out.println("однозначное число");
//            else if (nlenght == 2) System.out.println("двузначное число");
//            else if (nlenght == 3) System.out.println("трехзначное число");
//        }
        if (n > 0 && n % 2 == 0 && nlenght == 1) System.out.println("четное однозначное число");
        if (n > 0 && n % 2 != 0 && nlenght == 1) System.out.println("нечетное однозначное число");
        if (n > 0 && n % 2 == 0 && nlenght == 2) System.out.println("четное двузначное число");
        if (n > 0 && n % 2 != 0 && nlenght == 2) System.out.println("нечетное двузначное число");
        if (n > 0 && n % 2 == 0 && nlenght == 3) System.out.println("четное трехзначное число");
        if (n > 0 && n % 2 != 0 && nlenght == 3) System.out.println("нечетное трехзначное число");

    }
}
