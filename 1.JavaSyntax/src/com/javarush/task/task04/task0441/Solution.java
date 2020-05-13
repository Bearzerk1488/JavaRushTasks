package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int min = 0;
        int max = 0;
        int mid = 0;
        if (a > b) max = a;
        else max = b;
        if (max < c) max = c;
        if (a < b) min = a;
        else min = b;
        if (min > c) min = c;
        mid = (a + b + c - (max + min));
        System.out.println(mid);

    }
}
