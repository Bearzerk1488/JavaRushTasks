package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        if (args.length > 0 && args[0].equals("-c")) {
            BufferedReader fReader = new BufferedReader(new FileReader(fileName));
            Integer maxIndex = 0;
            while (fReader.ready()) {
                String data = fReader.readLine();
                if (!data.isEmpty()) {
                    int index = Integer.parseInt(data.substring(0, 8).trim());
                    if (maxIndex < index) maxIndex = index;
                }
            }
            fReader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.newLine();
            writer.write(String.format("%-8d%-30.30s%-8.2f%-4d", maxIndex + 1, args[1], Double.parseDouble(args[2]), Integer.parseInt(args[3])));
            writer.close();
        }
    }
}
