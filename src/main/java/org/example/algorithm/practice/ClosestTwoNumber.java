package org.example.algorithm.practice;

import java.util.Arrays;
import java.util.Comparator;

public class ClosestTwoNumber{
    public void closestTwoNumbers(Integer[] inteArray)
    {
        //find the closest two numbers that could be the sum of a given number.
        Integer[] copyArray = inteArray;
        Arrays.sort(copyArray, Comparator.reverseOrder());
        System.out.println("closest Two Numbers :" +copyArray[0]+" and "+copyArray[1]);
    }

}

