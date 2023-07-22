package org.example.algorithm.practice.two_pointer_technique;

public class Logic {

    /**
     * Using Native Technique
     * @param array
     * @param x
     * @return
     */
    public boolean getSumOfTwoElements(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("--------" + array[i]+"--------");
            for (int y = array.length-1; y >=0; y--) {
                //System.out.println("" + array[i] + "" + array[y]);
                if(array[i]!=array[y]) {
                    if (array[i] + array[y] == x) {
                        return true;
                    }
                }
            }
        }
                    return false;
    }

}
