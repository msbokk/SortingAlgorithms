
package sorting;


public class BubbleSort {
    public int [] bubbleSort(int [] arr){
    
        boolean flag=true;
        for(int i=0;i<arr.length;i++){
        
            flag=true;
            for(int j=0;j<arr.length-1;j++){
            
        
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                flag=false;
                
            }
        }
            
            if(flag){break;}
        }
        return arr;
    }
}
