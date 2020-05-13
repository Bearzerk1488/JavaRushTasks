package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.net.HttpURLConnection;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandFather1 = new Human("Vasya", true, 60);
        Human grandMother1 = new Human("Zina", false, 58);
        Human grandFather2 = new Human("Gora", true, 66);
        Human grandMother2 = new Human("Galya", false, 60);
        Human son1 = new Human("Igro", true, 40, grandFather1, grandMother1);
        Human son2 = new Human("Petr", true, 38, grandFather1, grandMother1);
        Human daughter1 = new Human("Olga", false, 38, grandFather2, grandMother2);
        Human daughter2 = new Human("Ira", false, 36, grandFather2, grandMother2);
        Human grandSon1 = new Human("Kolya", true, 14, son1, daughter1);
        System.out.println(grandFather1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandMother2.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(daughter1.toString());
        System.out.println(daughter2.toString());
        System.out.println(grandSon1.toString());
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}