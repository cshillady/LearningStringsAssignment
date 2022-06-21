package com.example.learningstringsagain.practice;

public class StringPractice {

    public static void main(String[] args) {
        var str = "Learn string handling";
        var str2 = "learn string handling";
        var str3 = "LEARN STRING HANDLING";
        str = str.toLowerCase();
        var ch1 = str.charAt(0);
        var ch2 = str.charAt(1);
        var ch3 = str.charAt(2);
        var ch4 = str.charAt(3);
        System.out.println("Character at 0 index is: " + ch1);
        System.out.println("Character at 1 index is: " + ch2);
        System.out.println("Character at 2 index is: " + ch3);
        System.out.println("Character at 3 index is: " + ch4);
        // 1) Using the string "Learn string handling": what index is the last letter in the string?
        var ch5 = str.charAt(str.length() - 1);
        System.out.println("The last character is:   " + ch5);
        // 2) Using the same string as above, what character is located at the 10th index?
        var ch6 = str.charAt(10);
        System.out.println("Character at 10 index is: " + ch6);
        // 3)Do a check to see if the character at index 10 and 15 the same?
        var ch7 = str.charAt(15);
        var doIndex10And15Match = false;
        if (ch6 == ch7) {
            doIndex10And15Match = true;
        }
        System.out.println("Does index 10 match index 15: " + doIndex10And15Match);
        // 4) Create a scenario that returns false if the character at the 0 index equals the 5 index
        var ch8 = str.charAt(5);
        var doIndex0And5Match = false;
        if (ch1 == ch8) {
            doIndex0And5Match = true;
        }
        System.out.println("Does index 0 match index 5: " + doIndex0And5Match);
        //length()
        System.out.println("length(): " + str.length());
        //equals()
        System.out.println("Do the strings match?: " + str.equals(str2));
        System.out.println("Do the strings match?: " + str.equals(str3));
        //equalsIgnoreCase()
        System.out.println("Do the strings match ignoring case?: " + str.equalsIgnoreCase(str3));
        //charAt()
        System.out.println("Character at 2 index is: " + ch3);
        //contains()
        System.out.println("Does the string contain 'hand'?: " + str.contains("hand"));
        //substring()
        var sub = str.substring(8, 17).trim();
        System.out.println("The substring equals: " + sub);
        //startsWith
        System.out.println("Does the string start with 'Lea'?: " + str.startsWith("lea"));
        //endsWith
        System.out.println("Does the string end with 'ing'?: " + str.endsWith("ing"));
        //toLowerCase()
        System.out.println("String 3 as lower case: " + str3.toLowerCase());
        //toUpperCase()
        System.out.println("Substring to upper case: " + sub.toUpperCase());
    }
}

