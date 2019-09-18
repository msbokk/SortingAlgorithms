
package searching;


public class LinearSearch {
    public int linearSearch(int [] arr, int value){
        int i=0; boolean flag=false;
        for(;i<arr.length;i++){
            if(arr[i]==value){
               flag=true;
                break; 
            }
        }
        if(flag)
            return i;
        else
            return -1;
    }
}
