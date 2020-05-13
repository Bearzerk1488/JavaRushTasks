package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
//        System.out.println(hen.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if (Country.RUSSIA.equals(country)) hen = new RussianHen();
            else if (Country.BELARUS.equals(country)) hen = new BelarusianHen();
            else if (Country.UKRAINE.equals(country)) hen = new UkrainianHen();
            else if (Country.MOLDOVA.equals(country)) hen = new MoldovanHen();
            //напишите тут ваш код
            return hen;
        }
    }
}