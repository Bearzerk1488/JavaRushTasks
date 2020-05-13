package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(byteArrayOutputStream);
        System.setOut(stream);
        testString.printSomething();
        String s = byteArrayOutputStream.toString();
        System.setOut(consoleStream);
        String[] strings = s.split("\\n");
        int count = 0;
        for (String str : strings
        ) {
            if (count == 2) {
                System.out.println("JavaRush - курсы Java онлайн");
                System.out.println(str);
                count = 1;
            } else {
                System.out.println(str);
                ++count;
            }
        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
