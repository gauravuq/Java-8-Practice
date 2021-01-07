package com.gaurav.streams_lambda.randomclasswithstream;

import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class RandomStreamGenerator {

    public static void main(String[] args) {


        Random random = new Random();
        Set<Integer> listGenerated =random.ints(10,1,10).boxed().collect(Collectors.toSet());
        int arrayGenerated [] = random.ints(10,1,10).toArray();

        System.out.println("Random List Generated "+listGenerated);
        System.out.println("Random Array Generated "+ Arrays.toString(arrayGenerated));
    }

}
