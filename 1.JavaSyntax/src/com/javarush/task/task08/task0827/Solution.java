package com.javarush.task.task08.task0827;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date thisdate = new Date(date);
        Date startDate = new Date();
        startDate.setMonth(0);
        startDate.setDate(1);
        startDate.setHours(0);
        startDate.setMinutes(0);
        startDate.setYear(thisdate.getYear());
        long dif = thisdate.getTime() - startDate.getTime();
        dif = dif /1000 / 60/60/24;
        System.out.println(dif);
        if (dif%2==0)
        return false;
        else return true;
    }
}
