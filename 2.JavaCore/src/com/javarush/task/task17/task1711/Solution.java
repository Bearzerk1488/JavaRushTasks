package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    private static Person getPerson(String name, String sex, String date) throws ParseException {
        Person person = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        if (sex.equals("м")) person = Person.createMale(name, simpleDateFormat.parse(date));
        else if (sex.equals("ж")) person = Person.createFemale(name, simpleDateFormat.parse(date));
        return person;
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length - 1; i++) {
                        allPeople.add(getPerson(args[i], args[i + 1], args[i + 2]));
                        System.out.println(allPeople.size() - 1);
                        i += 2;
                    }
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length - 1; i++) {
                        allPeople.set(Integer.parseInt(args[i]), getPerson(args[i + 1], args[i + 2], args[i + 3]));
                        i += 3;
                    }
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int id = Integer.parseInt(args[i]);
                        allPeople.get(id).setName(null);
                        allPeople.get(id).setSex(null);
                        allPeople.get(id).setBirthDate(null);
                    }
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    for (String arg : args
                    ) {
                        if (!arg.equals("-i")) {
                            String sex = "";
                            Person person = allPeople.get(Integer.parseInt(arg));
                            if (person.getSex().equals(Sex.MALE)) sex = "м";
                            else sex = "ж";
                            System.out.println(person.getName() + " " + sex + " " + simpleDateFormat1.format(person.getBirthDate()));
                        }
                    }
                }
                break;
            default:
                break;
        }
    }
}
