package org.example.algorithm.practice.beginner;

import java.util.Scanner;

/**
 * Find the result for Two to the power of given exponent/power value by user
 */
public class PowerValueOf2 {
    private static final int displayPowerValueof2(int power){
        int result =2;
        if(power == 0){
            return 1;
        }
        if(power == 1){
            return 2;
        }
        power=power-2;
        while(power>=0){
            result = result * 2;
            power--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Please Enter required exponent");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result =PowerValueOf2.displayPowerValueof2(input);
        System.out.println("2 to the power "+input+" is "+result);
    }
}
