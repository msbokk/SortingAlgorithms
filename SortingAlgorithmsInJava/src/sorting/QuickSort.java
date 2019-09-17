
package sorting;


public class QuickSort {

    public int partition(int [] arr,int start,int end){
        
        int j;
        
        int i=start-1;
        int pivot=arr[end-1];
        for(j=start;j<end-1;j++){
        if(arr[j]<=pivot){
        
            i++;
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        
        }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[end-1];
        arr[end-1]=temp;
        return 1+i;
        
        
      
    }
    public void quicksort(int [] arr, int start,int end){
    
       if(start<end){ 
        int mid;
        mid=partition(arr,start,end);
        quicksort(arr,start,mid);
        quicksort(arr,mid+1,end);

    }
    
    }
    
    
    
}
