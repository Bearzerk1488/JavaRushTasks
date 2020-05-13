package com.javarush.task.task15.task1527;

/* 
Парсер реквестов
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        URL url = new URL( reader.readLine());
        String query = url.getQuery();
        String[] params = query.split("&");
        Map <String, String> map = new LinkedHashMap<>();
        for (String par: params
             ) {
            if (par.contains("=")) {
                String [] q = par.split("=");
                String key = q[0];
                String value = q[1];
                map.put(key, value);
            } else map.put(par, null);
        }
        for (Map.Entry <String, String> pair: map.entrySet()
             ) {
            System.out.print(pair.getKey()+" ");
        }
        System.out.println("");
        for (Map.Entry <String, String> pair: map.entrySet()
        ) {
            if (pair.getKey().equals("obj")){
                try {
                    Double d = Double.parseDouble(pair.getValue());
                    alert(d);
                }catch (Exception e){
                    alert(pair.getValue());
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
