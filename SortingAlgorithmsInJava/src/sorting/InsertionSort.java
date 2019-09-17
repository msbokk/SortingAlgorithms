
package sorting;


public class InsertionSort {
    
    public int [] insertionSort(int [] arr){
        int key;
        int i,j;
        int n=arr.length;
        for(i=1;i<n;i++){
            key=arr[i];
            j=i-1;
            while(j>=0&&arr[j]>key){
            arr[j+1]=arr[j];
            j--;
            }
            arr[j+1]=key;
        }
        
        
        
        
        return arr;
    }
}
