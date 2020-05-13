package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new firstThread());
        threads.add(new secondThread());
        threads.add(new thirdThread());
        threads.add(new fourthThread());
        threads.add(new fifthThread());
    }

    public static void main(String[] args) {
    }

    public static class firstThread extends Thread {
        public void run() {
            while (true) {

            }
        }
    }

    public static class secondThread extends Thread {
        public void run() {
            if (isInterrupted())
                System.out.println("InterruptedException");
        }
    }

    public static class thirdThread extends Thread {
        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static class fourthThread extends Thread implements Message {
        private static boolean myBoolean = true;
        public void run() {
            while (myBoolean) {
            }
        }

        @Override
        public void showWarning() {
            myBoolean = false;
        }
    }

    public static class fifthThread extends Thread {
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            while (true) {
                try {
                    String s = reader.readLine();
                    if (s.equals("N")) {
                        System.out.println(sum);
                        break;
                    } else {
                        sum += Integer.parseInt(s);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}