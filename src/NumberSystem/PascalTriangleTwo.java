//# Print the Nth Row of Pascal's Triangle
//
//## Problem Statement
//
//Given an integer `N`, print all the elements present in the `N`th row of Pascal's Triangle.
//
//Pascal's Triangle is a triangular array of numbers in which each number is the sum of the two numbers directly above it. The first and last elements of every row are always `1`.
//
//The task is to generate and print all elements of a given row efficiently without constructing the entire Pascal's Triangle.
//
//  ## Example
//
//Input:
//N = 6
//
//Output:1 5 10 10 5 1
//
//Explanation:
//The 6th row of Pascal's Triangle is:
//'1 5 10 10 5 1`
//
//Input:
//N = 5
//
//Output:
//        1 4 6 4 1
//
//Explanation:
//The 5th row of Pascal's Triangle is:
//        `1 4 6 4 1`
//
//        ## Approach
//
//* The elements of the Nth row can be generated using the Binomial Coefficient formula.
//
//        * Start with the first element as `1`.
//
//        * Generate the next element using the relation:
//
//        `next = current * (N - i) / i`
//
//        * Repeat the process until all elements of the row are generated.
//
//This approach avoids calculating factorials and eliminates the need to generate the entire triangle.
//
//        ## Algorithm
//
//1. Initialize `ans = 1`.
//        2. Print the first element (`1`).
//        3. Iterate from `i = 1` to `N - 1`:
//
//        * Update `ans` using:
//        `ans = ans * (N - i) / i`
//        * Print `ans`.
//        4. Continue until all elements of the row are printed.
//
//## Time Complexity
//
//O(N)
//
//## Space Complexity
//
//O(1)
//
//## Concepts Used
//
//* Pascal's Triangle
//        * Binomial Coefficients
//* Combinatorics
//* Iterative Computation

package NumberSystem;


public class PascalTriangleTwo {
    public static void main(String[] args) {
        int row=6;
        int ans=1;
        System.out.print(ans+" ");
        for (int i = 1; i <row; i++) {
            ans*=row-i;
            ans/=i;
            System.out.print(ans +" ");
        }
    }
}
