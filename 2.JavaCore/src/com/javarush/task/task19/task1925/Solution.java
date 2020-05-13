package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        ArrayList <String> list = new ArrayList<>();
        String s;
        while((s=reader.readLine())!=null){
            String [] strings = s.split(" ");
            for (String str: strings
                 ) {
                if(str.length()>6) list.add(str);
            }
        }
        reader.close();
        for (int i = 0; i < list.size(); i++) {
            if (i==list.size()-1) writer.write(list.get(i));
            else writer.write(list.get(i)+",");
        }
        writer.close();
    }
}
