package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int maximum= -2147483648;
        if (n<=0);
        else {
            while (n > 0) {
                int a = Integer.parseInt(reader.readLine());
                maximum = maximum > a ? maximum : a;
                n--;
            }
            //напишите тут ваш код

            System.out.println(maximum);
        }
    }
}
