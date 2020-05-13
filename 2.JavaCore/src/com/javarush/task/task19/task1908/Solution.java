package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        FileWriter fileWriter = new FileWriter(reader.readLine());
        reader.close();
        BufferedReader reader1 = new BufferedReader(fileReader);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        String[] s;
        String result = "";
        while (reader1.ready()) {
            s = reader1.readLine().split(" ");
            for (int i = 0; i < s.length; i++) {
                System.out.println(s[i]);
                if (s[i].matches("\\b\\d+\\b")) result = result + s[i] + " ";
            }
        }
        writer.write(result);
        reader1.close();
        writer.close();
    }
}
