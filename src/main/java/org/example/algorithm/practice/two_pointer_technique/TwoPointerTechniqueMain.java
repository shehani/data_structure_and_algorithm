package org.example.algorithm.practice.two_pointer_technique;

public class TwoPointerTechniqueMain {
    public static void main(String[] args)
    {
        //find the closest two numbers that could be the sum of a given number.
        int[] array = {1,2,3,4,5,6};
        int target = 2;
        Logic ob = new Logic();
        System.out.println(ob.getSumOfTwoElements(array,target));
    }

}

