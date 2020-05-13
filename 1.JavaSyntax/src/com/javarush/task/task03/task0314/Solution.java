package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i = 1;
        int mul;
        while (i <= 10) {
            int j = 1;
            while (j <= 10) {
                mul = i * j;
                System.out.print(mul + " ");
                j++;
            }
            i++;
            System.out.println(" ");
        }
    }

}

