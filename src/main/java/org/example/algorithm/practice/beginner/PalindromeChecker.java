package org.example.algorithm.practice.beginner;

import java.util.Scanner;

/**
 * Find the user given String is a Palindrome or not
 */
public class PalindromeChecker {
    private static boolean displayValidityForPalindrome(String input){
        char[] originalInputArray= input.toCharArray();

        int pointer = originalInputArray.length - 1;
        StringBuilder sb = new StringBuilder(originalInputArray.length);

        while (!(pointer<0)){
            sb.append(originalInputArray[pointer]);
            pointer--;
        }
        if(sb.toString().equals(input)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word for checking palindrome");
        String input = sc.next();
        if(PalindromeChecker.displayValidityForPalindrome(input)){
            System.out.println("your word is a palindrome");
        }else{
            System.out.println("Given word is not a palindrome");
        }
    }
}
