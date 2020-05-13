package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, byte[]> map = new TreeMap<>();
        String destinationFileName;
        String fileName = reader.readLine();
        destinationFileName = fileName.substring(0, fileName.lastIndexOf("."));
        while (true){
            if(!fileName.equals("end")) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fileName));
                byte[] buffer = new byte[bufferedInputStream.available()];
                bufferedInputStream.read(buffer, 0, buffer.length);
                map.put(fileName, buffer);
                bufferedInputStream.close();
                fileName = reader.readLine();
            }else break;
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destinationFileName));
        for (Map.Entry<String,byte[]> pair: map.entrySet()
        ){
            bufferedOutputStream.write(pair.getValue());
        }
        bufferedOutputStream.close();
    }
}
