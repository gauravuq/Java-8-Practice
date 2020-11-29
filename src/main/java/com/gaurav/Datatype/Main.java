package com.gaurav.Datatype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List listInteger = Arrays.asList(new Integer [] {1,23,4,4,5});
        ArrayList<Integer> lstNumber = new ArrayList<>(listInteger);
        lstNumber.forEach(x-> System.out.println(x));
        Integer intNumber = 1;  // Integer.valueOf(1) Compile Time - Auto Boxing
        System.out.println(intNumber); // intNumber.intValue() Compile Time - Auto UnBoxing


    }

}
