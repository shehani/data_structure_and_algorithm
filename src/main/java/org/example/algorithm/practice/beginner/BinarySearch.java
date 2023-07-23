package org.example.algorithm.practice.beginner;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This class is to find an value from an array using Binary Search Algorithm
 */
public class BinarySearch {
    private static String findValue(int[] arr, int target){
        Arrays.sort(arr);
        System.out.println("Sorted array: "+Arrays.toString(arr));
        int low =0; //initially low is first element index
        int high = arr.length -1; //initially high is last element of the array
        while (low<=high){ //when low value is out of condition it's means element is not found from the array
            int mid =  low + (high - low) / 2; //identify middle element of the array
            System.out.println("mid is "+mid);
            if(arr[mid] == target){
                return "Found Element, Array index is "+mid;
            }else if(target<arr[mid]){
                high= mid-1;
            }else {
                low = mid+1;
            }

        }

        return "Not found";

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,9,8,7,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target value");
        int num = sc.nextInt();
        System.out.println(""+num);
        System.out.println(BinarySearch.findValue(arr,num));
    }
}
