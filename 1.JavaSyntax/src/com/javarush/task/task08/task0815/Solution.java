package com.javarush.task.task08.task0815;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Пётр");
        map.put("Сидиров", "Иван");
        map.put("Иванникоф", "Сергей");
        map.put("Иванников", "Александр");
        map.put("Смирноф", "Николай");
        map.put("Смирнов", "Павел");
        map.put("Шашоринс", "Андрей");
        map.put("Шашорин", "Даниил");
        map.put("Зенуков", "Богдан");
        return map;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry <String, String> pair : map.entrySet()) {
            if (name == pair.getValue()) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry <String, String> pair : map.entrySet()) {
            if (lastName == pair.getKey()) count++;
        }
        return count;
    }

    public static void main(String[] args) {
//        Map<String, String> map = createMap();
//        int name = getCountTheSameFirstName(map, "Иван");
//        int lastName = getCountTheSameLastName(map, "Иванников");
//        System.out.println(name + " " + lastName);
    }
}
