package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        testString.printSomething();
        String[] result = byteArrayOutputStream.toString().split(" ");
        System.setOut(consoleStream);
        int goal=0;
        switch (result[1]) {
            case ("+"):
                goal = Integer.parseInt(result[0]) + Integer.parseInt(result[2]);
                break;
            case ("-"):
                goal = Integer.parseInt(result[0]) - Integer.parseInt(result[2]);
                break;
            case ("*"):
                goal = Integer.parseInt(result[0]) * Integer.parseInt(result[2]);
                break;
        }

        System.out.println(result[0] + " " + result[1] + " " + result[2] + " " + result[3] + " " + goal);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

