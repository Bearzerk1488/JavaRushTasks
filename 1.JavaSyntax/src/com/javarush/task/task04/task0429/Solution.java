package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countp = 0;
        int countn = 0;
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a > 0 && a != 0) countp++;
        if (a < 0 && a != 0) countn++;
        if (b > 0 && b != 0) countp++;
        if (b < 0 && b != 0) countn++;
        if (c > 0 && c != 0) countp++;
        if (c < 0 && c != 0) countn++;
        System.out.println("количество отрицательных чисел: " + countn);
        System.out.println("количество положительных чисел: " + countp);

    }
}
