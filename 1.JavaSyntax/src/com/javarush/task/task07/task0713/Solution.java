package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> general = new ArrayList<>();
        ArrayList<Integer> divideBy3 = new ArrayList<>();
        ArrayList<Integer> divideBy2 = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) general.add(Integer.parseInt(reader.readLine()));

        for (int i = 0; i < general.size(); i++) {
            if (general.get(i) % 3 == 0 && general.get(i) % 2 == 0) {
                divideBy3.add(general.get(i));
                divideBy2.add(general.get(i));
            } else if (general.get(i) % 3 == 0) divideBy3.add(general.get(i));
            else if (general.get(i) % 2 == 0) divideBy2.add(general.get(i));
            else other.add(general.get(i));
        }

        printList(divideBy3);
        printList(divideBy2);
        printList(other);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) System.out.println(list.get(i));
    }
}
