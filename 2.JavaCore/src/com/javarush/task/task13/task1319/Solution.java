package com.javarush.task.task13.task1319;

/* 
Писатель в файл с консоли
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        while (true) {
            String s = reader.readLine();
            if (s.equals("exit")) {
                writer.write(s + "\n");
                break;
            } else {
                writer.write(s + "\n");
            }
        }
        reader.close();
        writer.close();

//        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
//        String line;
//        while ((line = bufferedReader.readLine()) != null) {
//            System.out.println(line);
//        }
//        bufferedReader.close();
    }
}
