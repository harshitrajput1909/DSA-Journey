package ArrayRecursion;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={5,4,10,3,2,6};
        sort(arr,0,1,0);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] arr,int i,int j,int min){
//        int min=i;
        if(j>arr.length){
            return;
        }
        if(j==arr.length){
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
            sort(arr,++i,i+1,i);
            return;
        }
        if(arr[j]<arr[min]){
//            min=j;
            sort(arr,i,++j,--j);
        }
        else{
            sort(arr,i,++j,min);
        }
    }
}
