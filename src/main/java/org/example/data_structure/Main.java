package org.example.data_structure;

import javax.swing.text.Style;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Array array = new Array(3);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.insert(50);

        array.printAllElements();

        array.removeAt(1);

        array.printAllElements();




    }



}