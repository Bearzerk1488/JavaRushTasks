package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String s;
        while ((s = reader.readLine()) != null) {
            PEOPLE.add(new Person(s.replaceAll("[0-9]", "").trim(), new SimpleDateFormat(" dd MM yyyy").parse(s.replaceAll("[a-zA-Zа-яА-Я\\-]", ""))));
        }
        reader.close();
//        for (Person p : PEOPLE
//        ) {
//            System.out.println(p.getName() + " " + p.getBirthDate());
//        }
    }
}
