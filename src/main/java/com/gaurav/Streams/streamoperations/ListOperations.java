package com.gaurav.Streams.streamoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOperations {


    public static void main(String[] args) {

        // Immutable List
        List<String> listOfNames = Arrays.asList("Gaurav","Sood","Ramit");

        //Printing with Stream
        listOfNames.stream()
                .map(String::toUpperCase)
                .filter(s->s.startsWith("G"))
                .forEach(System.out::println);

        //Creating a list after filtering
        List<String> sortedGNumbers = listOfNames.stream()
                .map(String::toUpperCase)
                .filter(s->s.startsWith("G"))
                .collect(Collectors.toList());
    }
}
