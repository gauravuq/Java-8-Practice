package com.gaurav.Alog_DataStruct.ArrayChallenges;

public class MinimumElementInArray {

    public static void main(String[] args) {

        Integer[] arrayOfNumbers = {131, 1312, 55, 23, -123123, 5, 2};
        recursiveAlgorithm(arrayOfNumbers, 0, Integer.MAX_VALUE);
    }

    // Rules of Recursion: 1) make sure there is a base condition for ending the recursion process;
    // Rules of Recursion: 2) make sure the recursion converges to base case with its input space;
    // Rules of Recursion: 3) make sure the recursive calls always work on distinct data each time to avoid overlapping;
    public static void recursiveAlgorithm(Integer[] arrayOfNumbers, Integer startingIndexOfArray, Integer currentMinimum) {
        Integer currentMinimumLocal = currentMinimum;
        Integer toBeStartingIndexOfArray = startingIndexOfArray;
        if (toBeStartingIndexOfArray > arrayOfNumbers.length - 1) {
            System.out.println();
            System.out.println("The minimum number is::" + currentMinimumLocal);
            return; // very important statement to kill recursion
        }
        if (currentMinimumLocal > arrayOfNumbers[toBeStartingIndexOfArray]) {
            currentMinimumLocal = arrayOfNumbers[toBeStartingIndexOfArray];
        }
        recursiveAlgorithm(arrayOfNumbers, ++toBeStartingIndexOfArray, currentMinimumLocal);
    }

}
