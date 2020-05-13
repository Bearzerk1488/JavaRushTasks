package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Person removedPerson = new Person(null,null,null);
        if (args[0].equals("-c")) {
            if (args[2].equals("м"))
                allPeople.add(Person.createMale(args[1], simpleDateFormat.parse(args[3])));
            else allPeople.add(Person.createFemale(args[1], simpleDateFormat.parse(args[3])));
            System.out.println(allPeople.size()-1);
        } else if (args[0].equals("-u")) {
            int id = Integer.parseInt(args[1]);
            allPeople.remove(id);
            if (args[2].equals("м")) {
                allPeople.add(id, Person.createMale(args[2], simpleDateFormat.parse(args[4])));
            } else allPeople.add(id, Person.createFemale(args[2], simpleDateFormat.parse(args[4])));
        } else if (args[0].equals("-d")) {
            allPeople.set(Integer.parseInt(args[1]),removedPerson);
        } else if (args[0].equals("-i")) {
            Person person = allPeople.get(Integer.parseInt(args[1]));
            String sex = "";
            if (person.getSex().equals(Sex.MALE)) sex = "м";
            else sex="ж";
            System.out.println(person.getName() + " " + sex + " " + simpleDateFormat1.format(person.getBirthDate()));
        } else {}
    }
}
