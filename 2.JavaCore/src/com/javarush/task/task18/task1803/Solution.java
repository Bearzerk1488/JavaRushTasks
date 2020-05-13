package com.javarush.task.task18.task1803;

/* 
Самые частые байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        ArrayList<Integer> list = new ArrayList<>();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            list.add(data);
        }
        fileInputStream.close();
        Collections.sort(list);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            Integer temp = list.get(i);
            if (!map.containsKey(temp)) map.put(temp, 1);
            else map.put(temp, map.get(temp) + 1);
        }
        int max = 0;
        for (Map.Entry<Integer, Integer> pair : map.entrySet()
        ) {
            //System.out.println(pair.getKey() + " " + pair.getValue());
            if (pair.getValue() > max) max = pair.getValue();
        }
        for (Map.Entry<Integer, Integer> pair : map.entrySet()
        ) {
            if (pair.getValue() == max)
                System.out.print(pair.getKey()+" ");
        }
    }
}
