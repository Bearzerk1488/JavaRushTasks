package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        list.add("dsfsdf");
        list.add("wfgkjwehgw");
        list.add("slgkjsdgk");
        list.add("skdjghsdhkg");
        list.add("skljhgsdkjsss");
        System.out.println(list.size());
        for (int i =0; i<5;i++) System.out.println(list.get(i));
    }
}
