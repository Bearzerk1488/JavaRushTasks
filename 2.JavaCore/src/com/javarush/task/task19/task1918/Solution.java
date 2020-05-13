package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
//c:\tmp\html.html

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        BufferedReader fr = new BufferedReader(new FileReader(file));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line=fr.readLine())!=null) {
            stringBuilder.append(line);
        }
        fr.close();
        //System.out.println(stringBuilder.toString());
        Document document = Jsoup.parse(stringBuilder.toString(),"",Parser.xmlParser());
        Elements elements = document.select(args[0]);
        for (Element element : elements
             ) {
            System.out.println(element);
        }
    }
}
