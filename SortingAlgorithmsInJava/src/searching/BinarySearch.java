
package searching;


public class BinarySearch {
    public int binarySearch(int [] arr,int value){
        
        int start=0;
        int end=arr.length-1;
        int mid;
        while(start<=end){
        mid=(start+end)/2;
        if(arr[mid]==value){
            return mid;
        }else if(arr[mid]>value){
            end=mid-1;
        }else {
        start=mid+1;
        }
        }
        
        
        
        return -1;
    }
}
