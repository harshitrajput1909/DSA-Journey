package ArrayRecursion;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={3,2,4,1,3,2};
        sort(arr,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int i,int j){
        if(i==arr.length-1){
            return;
        }
        if(j==arr.length-1){
            sort(arr,++i,0);
            return;

        }
        if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            sort(arr,i,++j);
        }
        else{
            sort(arr,i,++j);
        }
    }

}
