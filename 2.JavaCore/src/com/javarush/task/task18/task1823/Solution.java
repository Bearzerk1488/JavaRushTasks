package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = reader.readLine();
            if (fileName.equals("exit")) break;
            else {
                new ReadThread(fileName).start();
            }
        }
//        for (Map.Entry<String, Integer> pair : resultMap.entrySet()
//        ) {
//            System.out.println(pair.getKey() + " " + pair.getValue());
//        }

    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;

        }

        @Override
        public void run() {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.fileName));
                Map<Integer, Integer> map = new HashMap<>();
                int i;
                while ((i = bufferedInputStream.read()) != -1) {
                    if (map.get(i) == null) map.putIfAbsent(i,1);
                    else {
                        int count = map.get(i);
                        map.put(i, ++count);
                    }
                }
                int max = 0;
                int result = 0;
                for (Map.Entry<Integer, Integer> pair : map.entrySet()
                ) {
//                    System.out.println(pair.getKey() + " " + pair.getValue());
                    int value = pair.getValue();
                    if (value > max) {
                        max = value;
                        result = pair.getKey();
                    }
                }
                resultMap.put(this.fileName, result);
                bufferedInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
