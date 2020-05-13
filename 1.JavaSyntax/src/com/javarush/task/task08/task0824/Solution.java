package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human child1 = new Human("ch1", true, 5, new ArrayList<>());
        Human child2 = new Human("ch2", true, 6, new ArrayList<>());
        Human child3 = new Human("ch3", false, 4, new ArrayList<>());
        Human father = new Human("f1", true, 37, new ArrayList<>(Arrays.asList(child1, child2, child3)));
        Human mother = new Human("m1", false, 30, new ArrayList<>(Arrays.asList(child1, child2, child3)));
        Human gf1 = new Human("gf1", true, 70, new ArrayList<>(Arrays.asList(mother)));
        Human gm1 = new Human("gm1", false, 69, new ArrayList<>(Arrays.asList(mother)));
        Human gf2 = new Human("gf2", true, 71, new ArrayList<>(Arrays.asList(father)));
        Human gm2 = new Human("gm2",false, 68, new ArrayList<>(Arrays.asList(father)));
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(gf1.toString());
        System.out.println(gm1.toString());
        System.out.println(gf2.toString());
        System.out.println(gm2.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
