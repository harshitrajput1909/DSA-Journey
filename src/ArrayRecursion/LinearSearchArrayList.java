package ArrayRecursion;

import java.util.ArrayList;

public class LinearSearchArrayList {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,4,5,6,7,3
        };
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(check(arr,3,0,list));

    }
    static ArrayList<Integer> check(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index== arr.length){
            return list;

        }
        if(target==arr[index]){
            list.add(index);
        }
        return check(arr,target,index+1,list);

    }
}
