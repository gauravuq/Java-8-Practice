package com.gaurav.streams_lambda.streamoperations;

import com.gaurav.streams_lambda.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserObjectStreamIntOperations {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        Double sumPrices =
                productsList.stream()
                        .collect(Collectors.summingDouble(x -> x.getPrice()));
        System.out.println("Sum of prices: " + sumPrices);
        Integer sumId =
                productsList.stream().collect(Collectors.summingInt(x -> x.getId()));
        System.out.println("Sum of id's: " + sumId);
        Double avgPrices =
                productsList.stream()
                        .collect(Collectors.averagingDouble(x -> x.getPrice()));
        System.out.println("Avg of prices: " + avgPrices);

        String joinedValue = productsList.stream().map(x->String.valueOf(x.getId())).collect(Collectors.joining("|"));

        System.out.println("Joined of IDs: " + joinedValue);

    }
}
