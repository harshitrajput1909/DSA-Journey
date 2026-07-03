//# Nth Magic Number
//
//## Problem Statement
//
//Given an integer N, find the Nth Magic Number.
//
//A Magic Number is a number that can be represented as the sum of unique powers of 5. The binary representation of N is used to determine which powers of 5 are included in the Magic Number.
//
// ## Example
//
//Input:
//N = 1
//
//Output: 5
//
//Explanation:
//The binary representation of 1 is `1`. Since the first bit is set, the Magic Number is `5¹ = 5`.
//
//Input:
//N = 4
//
//Output:125
//
//Explanation:
//The binary representation of 4 is `100`. The third bit is set, so the Magic Number is `5³ = 125`.
//
//## Approach
//
//* Traverse the binary representation of N bit by bit.
//* For every set bit (1), add the corresponding power of 5 to the answer.
//* Continue until all bits are processed.
//
//        ## Algorithm
//
// 1. Initialize `sum = 0`.
// 2. Start with the least significant bit of N.
// 3. If the current bit is set, add the corresponding power of 5 to `sum`.
// 4. Move to the next bit and repeat the process until N becomes 0.
// 5. Return the final value of `sum`.
//
//## Time Complexity
//
// O(log N)
//
//## Space Complexity
//
// O(1)
//
//## Concepts Used
//
//* Bit Manipulation
//* Binary Representation
//* Mathematics

package NumberSystem;

public class NthMagicNumber {
    public static void main(String[] args) {

        int sum=0;
        int n=4;
        for (int i =0; i < 32; i++) {
            if(((n>>i)&1)==1){
                sum+=Math.pow(5,i+1);
            }
        }
        System.out.println(sum );
    }
}
