package com.javarush.task.task19.task1904;

/* 
И еще один адаптер
*/

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String [] person = fileScanner.nextLine().split(" ",4);
            SimpleDateFormat dateFormat = new SimpleDateFormat("d M y", Locale.ENGLISH);
            String d = person[3];
            String firstName = person[1];
            String middleName = person[2];
            String lastName = person [0];
            Date date = dateFormat.parse(d);
            Person person1 = new Person (firstName, middleName, lastName,date);
            return person1;
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }
}
