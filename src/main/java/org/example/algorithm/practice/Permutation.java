package org.example.algorithm.practice;

import java.util.Arrays;

public class Permutation {


    public boolean validForPermutation(String word1,String word2){
        if(word1.length()!=word2.length()){
            throw  new IllegalArgumentException();
        }
       char[] sortedWord1 =  word1.toCharArray();
       char[] sortedWord2 =  word2.toCharArray();
       Arrays.sort(sortedWord1);
       Arrays.sort(sortedWord2);

       System.out.println(Arrays.toString(sortedWord1));
       System.out.println(Arrays.toString(sortedWord2));

       String sortedStringWord1 = Arrays.toString(sortedWord1);
        String sortedStringWord2 = Arrays.toString(sortedWord2);


       if(sortedStringWord1.equals(sortedStringWord2))
           return true;
       else
           return false;


    }



}
