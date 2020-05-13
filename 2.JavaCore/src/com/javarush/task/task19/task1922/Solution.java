package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        BufferedReader fRider = new BufferedReader(new FileReader(file));
        String str;
        while ((str = fRider.readLine()) != null) {
            String[] s = str.split(" ");
            int match = 0;
            for (String line : s
            ) {
                if (words.contains(line)) match++;
            }
            if (match == 2) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i < s.length; i++) {
                    stringBuilder.append(s[i] + " ");
                }
                System.out.println(stringBuilder);
            }
        }
        fRider.close();
    }
}
