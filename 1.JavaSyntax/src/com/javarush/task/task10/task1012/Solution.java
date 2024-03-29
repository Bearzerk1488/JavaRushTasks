package com.javarush.task.task10.task1012;

import org.omg.CORBA.INTERNAL;
import sun.applet.resources.MsgAppletViewer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // напишите тут ваш код
        List<Integer> counts = new ArrayList<>();
        for (Character c : alphabet
        ) {
            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                char[] chars = list.get(i).toCharArray();

                for (int j = 0; j < chars.length; j++) {
                    if (c.equals(chars[j])) {
                        count++;
                    }
                }
            }
            counts.add(count);
        }
        for (int i = 0; i < alphabet.size(); i++) {
            System.out.println(alphabet.get(i) + " " + counts.get(i));
        }
    }
}
