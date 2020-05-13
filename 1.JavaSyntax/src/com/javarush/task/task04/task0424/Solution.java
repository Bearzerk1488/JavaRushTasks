package com.javarush.task.task04.task0424;

/* 
Три числа
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
        int s1 = 1;
        int s2 = 2;
        int s3 = 3;
        if (a != b && a != c && b!=c) s1=s2;
        else if (a != b && a != c) System.out.println(s1);
        else if (b != a && b != c) System.out.println(s2);
        else if (c != a && c != b) System.out.println(s3);


    }
}
