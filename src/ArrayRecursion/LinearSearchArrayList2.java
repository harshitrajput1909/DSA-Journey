package ArrayRecursion;
import java.util.*;
public class LinearSearchArrayList2 {
    public static void main(String[] args) {
     int [] arr={1,2,3,4,5,3,3};

    }
    static ArrayList<Integer> search(int[] arr,int target,int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> Elements=search(arr,target,index+1);
        list.addAll(Elements);
        return list;
    }

}
