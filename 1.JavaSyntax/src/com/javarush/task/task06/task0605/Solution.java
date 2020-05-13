package com.javarush.task.task06.task0605;


import java.io.*;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            // напишите тут ваш код
            double mIndex = weight / (height * height);
            if (mIndex < 18.5) System.out.printf("Недовес: меньше чем 18.5");
            else if (mIndex >= 18.5 && mIndex < 25) System.out.printf("Нормальный: между 18.5 и 25");
            else if (mIndex >= 25 && mIndex < 30) System.out.printf("Избыточный вес: между 25 и 30");
            else System.out.printf("Ожирение: 30 или больше");
        }
    }
}
