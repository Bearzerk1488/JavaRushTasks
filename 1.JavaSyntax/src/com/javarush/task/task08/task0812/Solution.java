package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) list.add(Integer.parseInt(reader.readLine()));
        int p = 1;
        int result = 1;

        for (int i = 0; i < list.size()-1 ; i++) {

            if (list.get(i).equals(list.get(i+1))) {
                p++;
                if (result < p) result = p;
            } else p = 1;
        }

        System.out.println(result);
        System.out.println(list.size());
    }
}