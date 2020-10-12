package com.gaurav.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    //Boundary Matchers: ^(starts with ) Example : "^apple", $(ends with) Example : "apple$"
    //Character Classes: [^sfsafas] negate this pattern of characters , do no match these character;\
        // \\d is a class to match all the numbers;
        // \\D is a class to match all non numbers;
        // \\s is a class to match all white spaces and tabs;
        // \\S is a class to match all non white spaces and tabs;
        // \\w is a class to match 0-9,a-z,A-Z & _ ;
        // \\W is a class to match anything apart from 0-9,a-z,A-Z & _ ;
        // \\b is a class to match the boundaries of a word; start and end of the word
    //Range: [a-eA-E3-8] match single pattern.in the range
        //  [a-eA-E3-8] [a-eA-E3-8] match two character like this
        // (?i)[a-eA-E3-8] match a character without taking into account it's case;
    //Quantifiers:
        // it tell how many time a preceding character should be matched; X{n} max three; x{lower limit,upper limit}, X{n,} at least n times
        // + this quantifier is for one or more matches of a preceding character;
        // * this quantifier is fro zero of more matches of a preceding character;
        // ? once or not at all ;
    // Using pattern and matcher classes when we want to find more than one occurrence;
        // we have to reset the matcher instance after using it once , so that we can use it again;
        // putting ? after * , will turn the greedy quantifier into a lazy quantifier;
            // the lazy quantifier stop the matching immediately after it is satisfied in the first match;
    // Look ahead regular expression
        // look ahead regular expression is denoted by (?[your thing here] )
        // "t(?!v)" this expression says to find the occurrences of t where it is not followed by v;
        // "t(?=v)" this expression says to find the occurrences of t where it is followed by v;
    // Logical operators in regular expression
        // and is denoted by "abc" -> a and b and c; this is implicit , no need to write
        // or is denoted by "[abc]" - > a or b or c ; this can be shown inside a bracket [H|h] or [Hh]
    // Some Sample Patterns:
        // US telephone numbers: ^([\(]{1} [0-9]{3}[\)]{1}[ ]{1}[0-9]{3}[\-]{1}[0-9]{4})$
        // Credit Card numbers: ^(4[0-9]{12}([0-3]{3})?)$

    public static void main(String[] args) {

        String alphaNumericString="abcdefjhijkl";
        String secondString="gaurav Sood";

        System.out.println(alphaNumericString.replaceAll("[d]","X"));
        System.out.println(alphaNumericString.matches("(.*)[d](.*)"));
        System.out.println(secondString.replaceAll("[g]","G"));
        System.out.println(secondString.matches("gaurav(.*)"));


        String pat = ".*d.*";
        Pattern pattern = Pattern.compile(pat);
        Matcher matcher = pattern.matcher(alphaNumericString);
        System.out.println(matcher.matches());

        String htmlString= "<html><h1>I am here</h1><h2>First h2</h2><h2>Second h2</h2></html>";
        String htmlPat="(<h2>)(.+?)(</h2>)";
        // lazy pattern match because of the ? after + or *.
        // group zero has the complete match.
        // group one has the first h2 match.
        // group two has the complete string between the h2 tags.
        // gropu three has ending h2 match.
        Pattern htmlPattern = Pattern.compile(htmlPat); // Match the pattern on a whole, just select which group you want to have
        Matcher htmlMatcher = htmlPattern.matcher(htmlString);

        System.out.println(htmlMatcher.replaceAll("lol"));
        System.out.println(htmlMatcher.replaceFirst("lol"));

        htmlMatcher.reset();
        while(htmlMatcher.find()){
            System.out.println(htmlMatcher.group(0));
        }

        String card1 = "444444444444400";
        String card2 = "12312525252525";
        String card3 = "243122512313";

        System.out.println(card1.matches("^(4[0-9]{12}([0-3]{2})?)$"));
        System.out.println(card2.matches("^4[0-9]{12}([0-3]{3})?$"));
        System.out.println(card3.matches("^4[0-9]{12}([0-3]{3})?$"));


    }

}
