package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "1");
        map.put("3", "2");
        map.put("4", "2");
        map.put("5", "3");
        map.put("6", "4");
        map.put("7", "5");
        map.put("8", "6");
        map.put("9", "7");
        map.put("10", "8");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            for (Map.Entry<String, String> paircopy : copy.entrySet()) {
                if (!paircopy.getKey().equals(key)&& paircopy.getValue().equals(value))
                    list.add(pair.getValue());
            }
        }
        for (int i = 0; i < list.size(); i++) {
            removeItemFromMapByValue(map, list.get(i));
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
//        Map<String, String> map = createMap();
//        removeTheFirstNameDuplicates(map);
//        System.out.println(map);
    }
}
