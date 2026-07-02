//# Rotate Array by One Position
//
//## Problem Statement
//
//Given an array of integers, rotate the array to the left by one position. In a left rotation, the first element of the array moves to the last position, and all other elements shift one position to the left.
//
//### Example
//
//**Input:**
//
//        ```
//        [1, 2, 3, 4, 5]
//        ```
//
//        **Output:**
//
//        ```
//        [2, 3, 4, 5, 1]
//        ```
//
//## Approach
//
//1. Store the first element of the array in a temporary variable.
//2. Shift all remaining elements one position to the left.
//3. Place the stored first element at the last index.
//
//## Complexity Analysis
//
//* **Time Complexity:** O(n)
//* **Space Complexity:** O(1)
//
//This approach performs the rotation in-place without using any extra array.

public class RotateArrayByOne {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        sort(nums);

        System.out.print("Array after left rotation by one position: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    static void sort(int[] arr) {
        int temp = arr[0];

        // Shift elements to the left
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        // Place the first element at the end
        arr[arr.length - 1] = temp;
    }
}