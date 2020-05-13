package com.javarush.task.task20.task2025;

import java.util.*;


/*
Алгоритмы-числа
*/
public class Solution {
    static ArrayList<Integer> replica = new ArrayList<>();


    public static void main(String[]args) {
        long start = System.currentTimeMillis();
        int[] array = getNumbers(99999999);
        long end = System.currentTimeMillis() - start; // считаю сколько секунд длилась "программа"
        long memore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory(); // считаю сколько памяти было занято.
        System.out.println("Time = " + end / 1000);
        System.out.println("Memory = " + memore / 1048576);

        for (int a : array) {
            if (a != 0)
                System.out.print(a + " ");
        }


    }
    public static int[] getNumbers(long N) {  //метод который дается по заданию


        for (int i = 0; i <= N; i++)
        {
            if (summa(i) == i)
                replica.add(i);

        }

        int[] result = new int[replica.size()];
        for (int i = 0; i < replica.size(); i++) {
            result[i] = replica.get(i);
        }

        return result;
    }



    public static int summa(int a) { // считаю сумму числа по "системе армстронга" будь он неладен
        int addition = 0;
        int d = lengthNumber(a);
        int  b = a % 10;
        while (a >= 1) {

            addition += stepen(d, b);
            a /= 10;
            b = a % 10;
        }

        return addition;
    }

    public static int lengthNumber(int a) {  //считаю длину числа

        int b = 0;
        while (a >= 1) {
            b++;
            a /= 10;
        }
        return b;
    }

    public static int stepen(int a, int b ) { // возвожу число в степень
        int result = b;
        for (int i = 1; i < a; i++) {
            result *= b;
        }
        return result;
    }
}