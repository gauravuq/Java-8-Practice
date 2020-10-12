package com.gaurav.test;

import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Main {

//    public static String LetterCapitalize(String str) {
//
//        StringBuffer s = new StringBuffer();
//        char ch = ' ';
//        for (int i = 0; i < str.length(); i++) {
//            if (ch == ' ' && str.charAt(i) != ' ')
//                s.append(Character.toUpperCase(str.charAt(i)));
//            else
//                s.append(str.charAt(i));
//            ch = str.charAt(i);
//
//
//            return str;
//    }
//
//    public static void main (String[] args) {
//        // keep this function call here
//        Scanner s = new Scanner(System.in);
//        System.out.print(LetterCapitalize(s.nextLine()));
//    }


        public static boolean PalindromeTwo(String str) {
            // code goes here
            String filteredString = str.replaceAll("[,!@#$%^&*()-]","");
            filteredString = filteredString.replaceAll("\\s","").toLowerCase();
            StringBuffer buffer = new StringBuffer(filteredString);
            String reversedString = buffer.reverse().toString();
            System.out.println(filteredString);
            System.out.println(reversedString);
            for (int i = 0;i<reversedString.length();i++)
            {
                if(reversedString.charAt(i) != filteredString.charAt(i))
                {
                    return false;
                }
            }

            System.out.println(filteredString.trim());
            return true;
        }

        public static void main (String[] args) {
            // keep this function call here
            Scanner s = new Scanner(System.in);
            System.out.print(PalindromeTwo("Anne, I vote more cars race Rome-to-Vienna"));
            Integer lol = 1;

        }



}
