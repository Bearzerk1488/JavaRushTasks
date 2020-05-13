package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileOne = reader.readLine();
        String fileTwo = reader.readLine();

        BufferedReader frOne = new BufferedReader(new FileReader(fileOne));
        String line = frOne.readLine();
        while (line != null) {
            allLines.add(line);
            line = frOne.readLine();
        }

        BufferedReader frTwo = new BufferedReader(new FileReader(fileTwo));
        String lineTwo = frTwo.readLine();
        while (lineTwo!=null){
            forRemoveLines.add(lineTwo);
            lineTwo = frTwo.readLine();
        }
        reader.close();
        frOne.close();
        frTwo.close();
        try {
            new Solution().joinData();
        }catch (CorruptedDataException e){
            System.out.println(e);
        }
//        for (String l: allLines
//             ) {
//            System.out.println(l);
//        }
    }

    public void joinData() throws CorruptedDataException {
        if (!allLines.containsAll(forRemoveLines)) {
            allLines.clear();
            throw new CorruptedDataException();
        }
        else {
            allLines.removeAll(forRemoveLines);
        }
    }
}
