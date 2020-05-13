package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings.add("упор");
        strings.add("вода");
        strings.add("мера");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        boolean bl, bp;
        ArrayList<String> result = new ArrayList<String>();
        for (String s: strings){
            bl = s.contains("л");
            bp = s.contains("р");
            if (bl ^ bp){
                if (bl) result.add(s);
                else continue;
            }
            result.add(s);
        }
        return result;
    }
}