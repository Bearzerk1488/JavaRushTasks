package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fr = new BufferedReader(new FileReader(args[0]));
        Map<String, Double> map = new TreeMap<>();
        String line;
        while ((line = fr.readLine()) != null) {
            String[] s = line.split(" ");
            if (map.containsKey(s[0])) {
                Double nd = map.get(s[0]);
                nd += Double.parseDouble(s[1]);
                map.put(s[0], nd);
            } else map.put(s[0], Double.parseDouble(s[1]));
        }
        fr.close();
        for (Map.Entry<String, Double> pair : map.entrySet()
        ) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}