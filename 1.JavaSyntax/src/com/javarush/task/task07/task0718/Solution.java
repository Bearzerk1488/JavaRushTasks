package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) list.add(reader.readLine());
        int min = 0;
        for (int i = 0; i < list.size(); i++) {
            if (min < list.get(i).length()) min = list.get(i).length();
            else {
                System.out.println(i);
                break;
            }
        }
    }
}

