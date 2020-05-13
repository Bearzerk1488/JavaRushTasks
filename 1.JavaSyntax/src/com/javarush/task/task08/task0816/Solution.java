package com.javarush.task.task08.task0816;

import org.omg.CORBA.DATA_CONVERSION;
import org.omg.CORBA.MARSHAL;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код
        map.put("Иванниов", dateFormat.parse("APRIL 20 1986"));
        map.put("Иванов", dateFormat.parse("JULY 11 1990"));
        map.put("Смирнов", dateFormat.parse("JUNE 10 1985"));
        map.put("Сидоров", dateFormat.parse("DECEMBER 11 1999"));
        map.put("Зенуков", dateFormat.parse("MARCH 10 1981"));
        map.put("Воробьев", dateFormat.parse("JANUARY 18 1979"));
        map.put("Евдакимов", dateFormat.parse("SEPTEMBER 29 1983"));
        map.put("Муравьева", dateFormat.parse("SEPTEMBER 23 1981"));
        map.put("Зонов", dateFormat.parse("AUGUST 05 1986"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator <Map.Entry<String, Date>>iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry <String, Date> entry = iterator.next();
            if(entry.getValue().getMonth()>4 && entry.getValue().getMonth() <8)iterator.remove();
        }

    }

    public static void main(String[] args)  {
//        Map <String, Date> map = createMap();
//        removeAllSummerPeople(map);
//        System.out.println(map);
    }
}
