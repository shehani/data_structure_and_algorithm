package org.example.algorithm.practice;

public class DerivedElements {
    private static void displayDerivedElements(){
        int[] arr = {2,3,4,5,6};
        int target = 2;

        for(int i = 0 ; i<arr.length;i++){
            int count = i;
            if(i<arr.length-1) {
                System.out.print(arr[i]);
                for (int y = target - 1; y != 0; y--) {
                    count++;
                    System.out.print(arr[count]);

                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DerivedElements.displayDerivedElements();
    }
}
