//# Count Number of Binary Digits
//
//## Problem Statement
//
//Given a positive integer `N`, determine the total number of digits required to represent the number in binary form.
//
//The task is to count how many bits are present in the binary representation of the given decimal number.
//
//## Example
//
//Input:
//N = 3
//
//Output:2
//
//Explanation:
//The binary representation of `3` is `11`, which contains 2 digits.
//
//Input:
//N = 10
//
//Output: 4
//
//Explanation:
//The binary representation of `10` is `1010`, which contains 4 digits.
//
//## Approach
//
//* Repeatedly divide the number by 2 using the right shift (`>>`) operator.
//* Each right shift removes the least significant bit from the binary representation.
//* Count the number of shifts required until the number becomes `0`.
//* The count obtained is the total number of binary digits.
//
//## Algorithm
//
//1. Initialize a counter variable `count` to `0`.
//2. While `N` is greater than `0`:
//
//* Right shift `N` by one position (`N = N >> 1`).
//* Increment `count`.
//3. When `N` becomes `0`, `count` represents the total number of binary digits.
//4. Print or return `count`.
//
//## Time Complexity
//
//O(log N)
//
//## Space Complexity
//
//O(1)
//
//## Concepts Used
//
//* Bit Manipulation
//* Binary Representation
//* Right Shift Operator (`>>`)

package Arrays;

public class CountTheBinaryDigit {
    public static void main(String[] args) {
        int n=3;
        int c=0;
        while(n>0){
            n=n>>1;
            c++;
        }
        System.out.printf("Their are total %d digits",c);
    }
}
