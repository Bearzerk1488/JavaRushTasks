package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        //напишите тут ваш код
        Cat tomCat = new Cat("Tom", 30, 15);
        Dog dogDog = new Dog("Dog", 40, 20);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //напишите тут ваш код
    public static class Dog {
        String name;
        int height;
        int strength;

        public Dog(String name, int height, int strength) {
            this.name = name;
            this.height = height;
            this.strength = strength;
        }
    }

    public static class Cat {
        String name;
        int height;
        int strength;

        public Cat(String name, int height, int strength) {
            this.name = name;
            this.height = height;
            this.strength = strength;
        }
    }
}
