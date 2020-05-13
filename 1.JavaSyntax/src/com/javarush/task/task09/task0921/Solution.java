package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            try {
                list.add(Integer.parseInt(reader.readLine()));
            } catch (Exception e) {
                for (int j = 0; j < list.size(); j++) {
                    System.out.println(list.get(j));
                }
                break;
            }
        }
    }
}
