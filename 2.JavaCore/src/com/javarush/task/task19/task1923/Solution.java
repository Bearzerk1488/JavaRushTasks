package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        String s;
        while ((s = reader.readLine()) != null) {
            String[] strings = s.split(" ");
            for (String line : strings
            ) {
                if (line.length() != line.replaceAll("\\d", "").length()) writer.write(line + " ");
            }
        }
        reader.close();
        writer.close();
    }
}

