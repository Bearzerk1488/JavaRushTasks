package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int max = 0;
        int min = 0;
        int mid = 0;

//        if (a > b) {
//            a1 = a;
//            if (a1 > c) {
//                System.out.println(a1 + " ");
//                if (b > c) System.out.println(b + " " + c);
//                else System.out.println(c + " " + b);
//            } else a1 = c;
//            System.out.println(a1 + " ");
//        } else a1 = b;
//        if (a1 > c) {
//            System.out.println(a1 + " ");
//        }
//        if (a > c) System.out.println(a + " " + c);
//        else System.out.println(c + " " + a);
        if (a >= b) max = a;
        else max = b;
        if (max >= c) max = max;
        else max = c;
        if (a <= b) min = a;
        else min = b;
        if (min >= c) min = c;
        mid = (a + b + c - (min + max));
        System.out.println(max + " " + mid + " " + min);
        //if (a != min && a != max) System.out.println(a + " " + min);
        //else if (b != min && b != max) System.out.println(b + " " + min);
        //else System.out.println(c + " " + min);

    }
}
