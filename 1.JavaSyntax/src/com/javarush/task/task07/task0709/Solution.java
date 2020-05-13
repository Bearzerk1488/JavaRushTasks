package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) list.add(reader.readLine());
        for (int left = 0; left < list.size(); left++) {
            // Вытаскиваем значение элемента
            String value = list.get(left);
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value.length() < list.get(i).length()) {
                    list.set((i + 1), list.get(i));
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            list.set((i + 1), value);
        }
        int min = list.get(0).length();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < min) min = list.get(i).length();
        }
        for (int i = 0; i < list.size(); i++) if (min == list.get(i).length()) System.out.println(list.get(i));
    }
}
