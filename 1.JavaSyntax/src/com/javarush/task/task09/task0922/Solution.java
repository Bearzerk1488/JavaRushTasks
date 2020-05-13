package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        SimpleDateFormat odf = new SimpleDateFormat("yyy-MM-dd");
        SimpleDateFormat ndf = new SimpleDateFormat("MMM dd, yyy");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Date date = new Date();
        date = odf.parse(reader.readLine());
        System.out.println(ndf.format(date).toUpperCase());
    }
}
