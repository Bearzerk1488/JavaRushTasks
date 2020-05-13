package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader = new BufferedReader(new FileReader(fileName));
        ArrayList<String> list = new ArrayList<>();
        String s = reader.readLine();
        while (s != null) {
            list.add(s);
            s = reader.readLine();
        }
        reader.close();
        if (args.length!=0) {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            switch (args[0]) {
                case "-d":
                    for (int i = 0; i < list.size(); i++) {
                        if (!list.get(i).startsWith(args[1])) {
                            writer.write(list.get(i));
                            writer.newLine();
                        }
                    }
                    break;
                case "-u":
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).startsWith(args[1])) {
                            writer.write(String.format("%-8d%-30.30s%-8.2f%-4d", Integer.parseInt(args[1]), args[2], Double.parseDouble(args[3]), Integer.parseInt(args[4])));
                            writer.newLine();
                        } else {
                            writer.write(list.get(i));
                            writer.newLine();
                        }
                    }
                    break;
            }writer.close();
        }

    }
}
