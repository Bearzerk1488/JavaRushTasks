package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set< Integer> set = new HashSet<>();
        set.add(10);
        set.add(11);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(15);
        set.add(22);
        set.add(23);
        set.add(9);
        set.add(8);
        set.add(7);
        set.add(6);
        set.add(5);
        set.add(47);
        set.add(128);
        set.add(13);
        set.add(17);
        set.add(18);
        set.add(99);
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Iterator <Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();
            if (i>10)iterator.remove();
        }


        return set;
    }

    public static void main(String[] args) {

    }
}
