package com.javarush.task.task03.task0325;

import javax.security.auth.login.CredentialException;
import java.io.*;
import java.util.*;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String value = reader.readLine();
        System.out.println("Я буду зарабатывать $" + value + " в час");
    }
}
