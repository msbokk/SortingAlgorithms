
package sorting;

import java.util.Arrays;


public class Sorting {

   
    public static void main(String[] args) {
       int [] array={50,10,33,5,445,65,43,43,6576,343};
       System.out.println(Arrays.toString(array));
       //InsertionSort s=new InsertionSort();
       //s.insertionSort(array);
//       MergeSort s=new MergeSort();
//      
//      System.out.print(Arrays.toString(s.mergeSort(array)));
//        QuickSort s=new QuickSort();
//        s.quicksort(array, 0, array.length);
//       System.out.println(Arrays.toString(array));
    
        BubbleSort s=new BubbleSort();
        s.bubbleSort(array);
        System.out.print(Arrays.toString(array));
    }
    
}
