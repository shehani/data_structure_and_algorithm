package org.example.algorithm.practice.beginner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * find the dum of values given from a file
 * comma seperated values will be in the file ex: 1,2,3,5,6 and value must be >0 and <10
 * and the values will be stored in the file only in first line
 * identified solution - Read values from the file and store into a List<Integer>
 *     and iterate list for get the sum of each element
 */
public class AddingValuesOfElementsFromList {

    private static int addElements(List<Integer> arr){
        int count = 0 , sum =0;
        while (count <= (arr.size()-1)){
            if(arr.get(count)>0 && arr.get(count)<=10) {
                sum = sum + arr.get(count);
            }
            count++;
        }
        return sum;
    }

    private static List<Integer> readFile(BufferedReader br) throws IOException{
        List<Integer> list = new ArrayList<>();
        String line = br.readLine();

        if (line != null){
            System.out.println(line);
            char[] arr = line.toCharArray();
             int count = 0;
             while ( count <= (arr.length-1)){
                 list.add((Character.getNumericValue(arr[count])));
                 count++;
             }
            br.close();
        }else{
            System.out.println("File first line is empty");
        }
        return list;
    }
    public static void main(String[] args) {
        try {
            String filePath = "src/main/resources/elements.txt";
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println("File can be accessed!!");
            List arr = AddingValuesOfElementsFromList.readFile(bufferedReader);
            int sum = AddingValuesOfElementsFromList.addElements(arr);
            System.out.println("Sum of Array is "+sum);
        }catch (FileNotFoundException ex){
            System.out.println("File Not Found "+ex.getMessage());
        }catch (IOException ex){
            System.out.println("empty line");
        }
    }
}
