/*
------------------------------------------------------------
Problem: Quick Sort

Description:
Quick Sort is a divide-and-conquer sorting algorithm that
selects a pivot element and partitions the array into two
parts:
1. Elements smaller than the pivot.
2. Elements greater than the pivot.

The process is recursively applied to both partitions until
the entire array is sorted.

Example:
Input:
[5, 4, 3, 2, 1]

Output:
[1, 2, 3, 4, 5]

Approach:
1. Choose the middle element as the pivot.
2. Move two pointers from both ends of the array.
3. Swap elements that are on the wrong side of the pivot.
4. Recursively sort the left and right partitions.

Time Complexity:
- Best Case: O(n log n)
- Average Case: O(n log n)
- Worst Case: O(n²)

Space Complexity:
- O(log n) (Recursive call stack)

Concepts Used:
- Divide and Conquer
- Recursion
- Two Pointers
- In-place Sorting

Language: Java
Date Solved: 01-07-2026
------------------------------------------------------------
*/
package ArrayRecursion;

import java.util.Arrays;

public class CycleSort {
    static void main() {
        int[] arr={5,4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString((arr)));
    }
    static void sort(int [] arr,int start,int end){
        if(start>=end){
            return;
        }
        int s=start;
        int e=end;
        int mid=s+(e-s)/2;
        //loop for broken parts
        while(s<=e){
            //loop to check that if the elemt is smaller than mid
            while(arr[s]<arr[mid]){
                s++;
            }
            // loop to check that the elemt is greater than mid
            while(arr[e]>arr[mid]){
                e--;
            }

            if(s<=e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        sort(arr,start,e);
        sort(arr,s,end);

    }
}
