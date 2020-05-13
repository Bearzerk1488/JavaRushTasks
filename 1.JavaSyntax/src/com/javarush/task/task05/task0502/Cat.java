package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
//        boolean isage = this.age > anotherCat.age;
//        boolean isweight = this.weight > anotherCat.weight;
//        boolean isstrength = this.strength > anotherCat.strength;
        int result1 = 0;
        int result2 = 0;
        if (this.age > anotherCat.age) result1++;
        if (this.age < anotherCat.age) result2++;

        if (this.weight > anotherCat.weight) result1++;
        if (this.weight < anotherCat.weight) result2++;

        if (this.strength > anotherCat.strength) result1++;
        if (this.strength < anotherCat.strength) result2++;

        if (result1 > result2) return true;
        else if (result1 == result2) return false;
        else return false;
    }

    public static void main(String[] args) {
        Cat vaska = new Cat();
        Cat barsik = new Cat();
        vaska.age = 4;
        vaska.weight = 2;
        vaska.strength = 2;
        barsik.age = 2;
        barsik.weight = 2;
        barsik.strength = 4;
        System.out.println(vaska.fight(barsik));
        System.out.println(barsik.fight(vaska));

    }
}
