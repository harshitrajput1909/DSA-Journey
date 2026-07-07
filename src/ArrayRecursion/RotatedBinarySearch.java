//# Rotated Binary Search (Recursive)
//
//## Problem Statement
//Given a sorted array that has been rotated at an unknown pivot, find the index of a target element using **Recursion**. If the target is not present in the array, return `-1`.
//
//        ### Example
//
//**Input:**
//        ```java
//arr = [7, 8, 9, 0, 1, 2, 3, 4, 5]
//target = 0
package ArrayRecursion;

public class RotatedBinarySearch {
    public static void main(String[] args) {
int [] arr={7,8,9,0,1,2,3,4,5};
        System.out.println(search(arr,0,arr.length-1,0));
    }
    static int search(int[] arr,int start,int end,int target){
        int mid=start+(end-start)/2;
        if(start>end){
            return -1;
        }
        if(arr[mid]==target){
            return mid;
        }
        if(arr[start]<=arr[mid]){
            if(target>=arr[start]&&target<arr[mid]){
//                end=mid-1;
                return search(arr,start,mid-1,target);
            }
            else{
//                start=mid+1;
                return search(arr,mid+1,end,target);
            }
        }
        else{
            if(target>arr[mid]&&target<=arr[end
                    ]) {
//                start = mid + 1;
               return  search(arr,mid+1,end,target);
            }
            else{
                return search(arr,start,mid-1,target);
            }

        }
//        return -1;
    }
}
