package com.gaurav.alogrithms_datastructure.BackTracking;

import java.util.Arrays;

public class GenerateStringsOfNBits {

    public static Integer A[] = new Integer[10];

    public static void main(String[] args) {

        Binary(5);
    }

    public static void Binary(Integer n)
    {
        if (n<1)
            System.out.println(Arrays.toString(A));
        else
        {
            A[n-1] = 0;
            Binary(n-1);
            A[n-1] =1;
            Binary(n-1);
        }
    }

}
