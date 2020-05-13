package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map <String , Integer> map = new HashMap<>();
        map.put("1",100);
        map.put("2",110);
        map.put("3",200);
        map.put("4",300);
        map.put("5",501);
        map.put("6",510);
        map.put("7",300);
        map.put("8",700);
        map.put("9",800);
        map.put("10",450);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> pair = iterator.next();
            if (pair.getValue() < 500) iterator.remove();
        }
    }

    public static void main(String[] args) {
//        Map <String, Integer> map = createMap();
//        removeItemFromMap(map);
//        System.out.println(map);
    }
}