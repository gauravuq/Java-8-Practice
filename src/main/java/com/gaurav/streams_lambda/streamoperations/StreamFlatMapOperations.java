package com.gaurav.streams_lambda.streamoperations;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFlatMapOperations {

    public static void main(String[] args) {

        String[][] data = new String[][]{{"a","a","b"}, {"c", "d"}, {"e", "f"}};

        //Stream<String[]>
        Stream<String[]> temp = Arrays.stream(data);

        Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));

        // Stream looks like  {"a","a","b","c", "d","e", "f"}
        Stream<String> stream = stringStream.filter(x -> "a".equals(x));

        stream.forEach(System.out::println);

    }
}
