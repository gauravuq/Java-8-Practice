package com.gaurav.Alog_DataStruct.ArrayChallenges;

import java.util.Arrays;

public class LeftRotateAnArray {

    public static void main(String[] args) {
        Integer arr[] = {1,2,3,4,5,6};
        leftRotateAnArrayUsingAnExtraArray(arr,5);
        System.out.println(Arrays.toString(arr));
    }

    private static void leftRotateAnArray(Integer[] arr, Integer rotateBy) {
        Integer trueLength = arr.length-1;
        for (Integer rotateCounter=0;rotateCounter < rotateBy;rotateCounter++) {
            Integer temp = arr[0];
            pushArrayElementsToLeft(arr);
            arr[trueLength] = temp;
        }
    }

    private static void pushArrayElementsToLeft(Integer[] arr) {
        Integer trueLength = arr.length-1;
        for(Integer traverseCounter = 0; traverseCounter< trueLength; traverseCounter++)
        {
            arr[traverseCounter] = arr[traverseCounter+1];
        }
    }

    private static void leftRotateAnArrayUsingAnExtraArray(Integer[] arr, Integer rotateBy){
        Integer trueRotation = rotateBy % arr.length;
        Integer [] tempArray = new Integer[trueRotation];
        for(Integer i=0;i<trueRotation;i++)
           tempArray[i] = arr[i];
        for (Integer rotateCounter=0;rotateCounter < trueRotation;rotateCounter++)
            pushArrayElementsToLeft(arr);
        Integer counterForTempArray=0;
        for(Integer i=arr.length-trueRotation;i<arr.length;i++){
            arr[i] = tempArray[counterForTempArray++];
        }

    }

}
