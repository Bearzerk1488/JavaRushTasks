package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        Map<Integer, Integer> map = new TreeMap<>();
        int i;
        int count = 1;
        while ((i = bufferedInputStream.read()) != -1) {
            if (map.get(i) == null) map.put(i, count);
            else {
                int value = map.get(i);
                map.put(i, ++value);
            }
        }
        bufferedInputStream.close();
        for (Map.Entry<Integer, Integer> pair : map.entrySet()
        ) {
            System.out.println((char) (int) pair.getKey() + " " + pair.getValue());
        }
    }
}
