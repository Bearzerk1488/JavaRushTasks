package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int count = Integer.parseInt(reader.readLine());
//        if (count > 0) {
        while (count > 0) {
            System.out.println(s);
            count--;
//            }
//        }
//        while (count-->0)
//            System.out.println(s);
        }
    }
}