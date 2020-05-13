package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

import sun.security.krb5.internal.APRep;

import java.util.Date;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private boolean sex;
        private Date birth;
        private List<Human> parents;
        private List<String> skills;
        private String wishes;

        public Human() {
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, boolean sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, boolean sex, Date birth) {
            this.name = name;
            this.sex = sex;
            this.birth = birth;
        }

        public Human(String name, Date birth) {
            this.name = name;
            this.birth = birth;
        }

        public Human(boolean sex, Date birth, List<Human> parents) {
            this.sex = sex;
            this.birth = birth;
            this.parents = parents;
        }

        public Human(String name,boolean sex, Date birth,List<Human> parents ){
            this.name = name;
            this.sex = sex;
            this.birth = birth;
            this.parents = parents;
        }

        public Human(String name,boolean sex, Date birth,List<Human> parents, List<String> skills ){
            this.name = name;
            this.sex = sex;
            this.birth = birth;
            this.parents = parents;
            this.skills = skills;
        }
        public Human(String name,boolean sex, Date birth,List<Human> parents, String wishes ){
            this.name = name;
            this.sex = sex;
            this.birth = birth;
            this.parents = parents;
            this.wishes = wishes;
        }
        public Human(String name,boolean sex, Date birth,List<Human> parents, List<String> skills, String wishes ){
            this.name = name;
            this.sex = sex;
            this.birth = birth;
            this.parents = parents;
            this.skills = skills;
            this.wishes = wishes;
        }

        // Напишите тут ваши переменные и конструкторы
    }
}
