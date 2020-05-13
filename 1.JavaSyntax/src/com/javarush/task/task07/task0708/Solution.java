package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) strings.add(reader.readLine());
        for (int left = 0; left < strings.size(); left++) {
            // Вытаскиваем значение элемента
            String value = strings.get(left);
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value.length() < strings.get(i).length()) {
                    strings.set((i + 1), strings.get(i));
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            strings.set((i + 1), value);
        }
        int max = 0;
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > max) max = strings.get(i).length();
        }
        for (int i = 0; i < strings.size(); i++) if (max == strings.get(i).length()) System.out.println(strings.get(i));
    }
}
