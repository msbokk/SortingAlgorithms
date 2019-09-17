package sorting;

public class MergeSort {

    private int[] merge(int [] a,int [] b) {
       
        
        int[] x;
        x = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (k < a.length + b.length && i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                x[k] = a[i];
                k++;
                i++;
            } else {

                x[k] = b[j];
                k++;
                j++;
            }
        }
        while (i < a.length) {

            
                x[k] = a[i];
                k++;
                i++;
            
        }
        while (j < b.length) {

                x[k] = b[j];
                k++;
                j++;
            }
        

        return x;
    }
    
    public int [] mergeSort(int [] arr){
        if(arr.length<=1){
            return arr;
        } else {
             int n=arr.length;
        int start,mid,end;
        start=0;
        end=n;
        mid=(start+end)/2;
        int[] a;
        a = new int[mid-start];
        int[] b=new int[end-mid];
       int r=0;
        for( ;r<mid;r++){
        
            a[r]=arr[r];
        }
        for(int i=0;i<b.length;i++){
            
            b[i]=arr[r];
            r++;
        }
        
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));
        
        int [] o=mergeSort(a);
        int [] p=mergeSort(b);
        arr= merge(o,p);
        return arr;
        
        }
        
       
        
        
    }

}
