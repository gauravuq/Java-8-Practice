package com.gaurav.Alog_DataStruct.BackTracking;

import java.util.Arrays;

public class KStringArray {

    public static Integer A[] = new Integer[10];

    public static void main(String[] args) {

        kstring(3,3);

    }

    public static void kstring(Integer n, Integer k)
    {
        if (n<1)
            System.out.println(Arrays.toString(A));
        else
        {
            for (Integer j = 0; j < k; j++) {
                A[n-1]=j;
                kstring(n-1,k);
            }
        }
    }
}
