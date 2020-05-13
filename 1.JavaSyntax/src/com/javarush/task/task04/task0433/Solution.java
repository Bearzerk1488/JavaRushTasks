package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int x = 0;
        while (x < 10) {
            int y = 0;
            while (y < 10) {
                System.out.print("S");
                y++;
            }
            System.out.println("");
            x++;
        }
    }
}
