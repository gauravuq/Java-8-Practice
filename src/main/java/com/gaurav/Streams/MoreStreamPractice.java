package com.gaurav.Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoreStreamPractice {

    public static void main(String[] args) {



        char arr[] = { '1', '2', '3', '4', '5' };
        Stream<char[]> stream = Stream.of(arr);
        stream.collect(Collectors.toCollection(HashSet::new)).forEach(x-> System.out.println(x));

        Stream<Integer> streamInt = Stream.generate(new Random()::nextInt).limit(10);
        streamInt.forEach(x-> System.out.println(x));

        List<String> list = new ArrayList<>();
        Stream.of("One", "Two", "Three", "Four").collect(Collectors.toCollection(LinkedList::new)).descendingIterator().forEachRemaining(x->list.add(x));
        System.out.println(list);

        String arrayOfString[]= Stream.of("One", "Two", "Three", "Four").toArray(String[]::new);
        String array[] = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(arrayOfString));
        System.out.println(Arrays.toString(array));




    }




}



