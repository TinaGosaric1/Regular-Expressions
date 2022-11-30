package com.tg;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String myString = "Moj lep string. Danes je lep dan.";

        System.out.println(myString.replaceAll(".", "Y")); // . replaces each character, but does not change the original string
        System.out.println(myString.replaceAll("^M", "xy")); // ^ represents the beginning of the string
        System.out.println(myString.replaceAll("an\\.$", "the end")); // $ represents the end of the string and \\ is for writing a special character
        System.out.println(myString.matches("Moj lep string")); // the whole string has to match, ^ $ do not work here
        System.out.println(myString.replaceAll("[aei]", "X")); // replaces all 'a', 'e', 'i' characters with 'X'
        System.out.println(myString.replaceAll("[aei][ne]", "Y")); // replaces all combinations ('an', 'ae', 'en', 'ee', 'in', 'ie')
        System.out.println("harry".replaceAll("[hH]arry", "Harry"));
        System.out.println(myString.replaceAll("[^an]", "L")); // replace everything, except 'a' and 'n'
        System.out.println(myString.replaceAll("[a-f3-8]", "X")); // replace in range a-f and 3-8
        System.out.println(myString.replaceAll("(?i)[A-F3-8]", "X")); // (?i) eliminates case sensitivity
        System.out.println(myString.replaceAll("\\d", "X")); // replaces all digits
        System.out.println(myString.replaceAll("\\D", "X")); // replaces all non-digits
        System.out.println(myString.replaceAll("\\s", "")); // removes all white space
        System.out.println(myString.replaceAll("\t", "X"));
        System.out.println(myString.replaceAll("\\S", "")); // removes all non-white space characters
        System.out.println(myString.replaceAll("\\w", "")); // removes a-z, A-Z, 0-9 and underscore
        System.out.println(myString.replaceAll("\\b", "***")); // each world has been surrounded by the replacement string
        System.out.println("abcDeee76".replaceAll("^abcDe{3}", "***")); // {3} indicates the number of copies of the preceding character that must occur ('eee')
        System.out.println("abcDeee76".replaceAll("^abcDe+", "YYY")); // + indicates any non-negative number of copies of the preceding character
        System.out.println("abcD76".replaceAll("^abcDe*", "***")); // * 'e' can appear any number of times or not at all
        System.out.println("abcDeeeee76".replaceAll("^abcDe{2,5}", "+")); // * 'e' can appear 2-5 times
        System.out.println("hhj".replaceAll("h+i*j", "-")); // at least one 'h' followed by zero or more 'i' followed by 'j'
    }
}