package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String line;
        TreeMap<String, Double> map = new TreeMap<>();
        while ((line = reader.readLine()) != null) {
            String[] sArr = line.split(" ");
            if (map.containsKey(sArr[0])) {
                Double val = Double.parseDouble(sArr[1]);
                val += map.get(sArr[0]);
                map.put(sArr[0], val);
            } else map.put(sArr[0], Double.parseDouble(sArr[1]));
        }
        reader.close();
        Double max= 0.0;
        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, Double> pair : map.entrySet()
        ) {
            if (pair.getValue()>max)max = pair.getValue();
        }
        for (Map.Entry<String, Double> pair : map.entrySet()
        ) {
            if (pair.getValue().equals(max)){
                list.add(pair.getKey());
            }
        }
        Collections.sort(list);
        for (String s: list
             ) {
            System.out.println(s);
        }
    }
}
