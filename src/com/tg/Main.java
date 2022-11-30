package com.tg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CheckedOutputStream;

public class Main {
    public static void main(String[] args) {
        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading<h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");

        String h2Pattern = ".*<h2>.*"; // . will match any character and * means zero or more (there can be anything before and anything after <h2>)
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

    }
}