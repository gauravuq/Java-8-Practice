package com.gaurav.streams_lambda.streamoperations;

import com.gaurav.streams_lambda.entities.Fruit;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UserObjectWithListMapOperations {

    public static void main(String[] args) {

        List<Fruit> fruits = Arrays.asList(
                new Fruit("apple", 10, new BigDecimal("9.99")),
                new Fruit("banana", 20, new BigDecimal("19.99")),
                new Fruit("orange", 10, new BigDecimal("29.99")),
                new Fruit("watermelon", 10, new BigDecimal("29.99")),
                new Fruit("papaya", 20, new BigDecimal("9.99")),
                new Fruit("apple", 10, new BigDecimal("9.99")),
                new Fruit("banana", 10, new BigDecimal("19.99")),
                new Fruit("apple", 20, new BigDecimal("9.99"))
        );

        // Group by Name
        Map<String, List<Fruit>> groupByName =
                fruits.stream().collect(Collectors.groupingBy(Fruit::getName));

        // Count the number of fruits
        Long count = fruits.stream().collect(Collectors.counting());


        // group by price, uses 'mapping' to convert List<Fruit> to Set<String>
        Map<BigDecimal, Set<String>> groupByPrice =
                fruits.stream().collect(
                        Collectors.groupingBy(Fruit::getPrice, Collectors.mapping(Fruit::getName, Collectors.toSet())));
        // group by price, to simple set of Fruits
        Map<BigDecimal, Set<Fruit>> groupByPrice2 =
                fruits.stream().collect(
                        Collectors.groupingBy(Fruit::getPrice,  Collectors.toSet()));

        // Printing
        groupByName.forEach((x,y)-> System.out.println("Key="+x+" Value="+y));
        System.out.println("The Count="+count);
        System.out.println(groupByPrice);
        System.out.println(groupByPrice2);

    }
}
