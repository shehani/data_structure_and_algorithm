package org.example.data_structure;

public class Array {

    int[] num ;

    private int count;

    /**
     * initializing an array with user defined array size
     * @param index
     */
    public Array(int index){
        num = new int[index];
    }

    /**
     * inserting elements to the numm array
     * @param element
     */
    public void insert(int element){
        //if array is full resize it
           if(num.length==count){
               int[] newNum = new int[count*2];
               for(int i = 0 ; i<count ; i++){
                   newNum[i]=num[i];
               }

               num = newNum;

           }
          //add new item
            this.num[count++] = element;


    }

    /**
     * displaying all the elements
     */
    public void printAllElements(){
        for(int i = 0 ; i<count ;i++){
            System.out.println(num[i]);
        }
    }

    /**
     * remove element
     */

    public void removeAt(int index){
        //validate index
        if(index<0 || index>=count)
            throw new IllegalArgumentException();

        //remove element
        //[10,20,30]
        //index 1 to be removed menas 30 should replace with 20
        int nextElement = index+1;
        for(int i = index; i<count ; i++){
            num[i] = num[nextElement];
            nextElement++;
        }
        count--;

    }


}
