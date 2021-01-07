package com.gaurav.alogrithms_datastructure.ArrayChallenges;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {

        Integer [] arr = {1,2,3,4,5};
        System.out.println("Before Reversing::"+ Arrays.toString(arr));
        reverseTheArray(arr);
        System.out.println("After Reversing::"+ Arrays.toString(arr));
    }


    public static void reverseTheArray(Integer [] arr){
        Integer trueLength = arr.length-1; // 0 to 4
        Integer halfLength = trueLength/2; // 2
        for(Integer j = 0; j<=halfLength; j++) //J runs from  0,1,2
        {
            swapTheValues (j,trueLength-j,arr);
        }
    }

    private static void swapTheValues(Integer indexA, Integer indexB, Integer [] arr){
        Integer temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }

}
