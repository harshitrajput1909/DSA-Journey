//# Print Pascal's Triangle up to N Rows
//
//        ## Problem Statement
//
//Given an integer `N`, print Pascal's Triangle up to the `N`th row.
//
//Pascal's Triangle is a triangular arrangement of numbers where each number is the sum of the two numbers directly above it. The first and last element of every row is always `1`.
//
//The task is to print all rows of Pascal's Triangle efficiently without generating the entire triangle using extra space.
//
//        ## Example
//
//Input:
//N = 5
//
//Output:
//        1
//        1 1
//        1 2 1
//        1 3 3 1
//        1 4 6 4 1
//
//        ## Approach
//
//* Iterate through each row from `1` to `N`.
//
//        * For every row, initialize the first element as `1`.
//
//        * Generate subsequent elements using the relation:
//
//        `next = current * (row - i) / i`
//
//        * Print each element as it is generated.
//
//This approach computes each element directly using Binomial Coefficients and avoids the overhead of factorial calculations.
//
//        ## Algorithm
//
//1. Loop through all rows from `1` to `N`.
//        2. Initialize `ans = 1` for every row.
//        3. Print the first element (`1`).
//        4. For each remaining position in the row:
//
//        * Update `ans` using:
//        `ans = ans * (row - i) / i`
//        * Print `ans`.
//        5. Move to the next row and repeat.
//
//## Time Complexity
//
//O(N²)
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
//* Mathematics

package NumberSystem;

public class PascalTriangleThird {
        public static void main(String[] args) {
            for (int row = 1; row < 6; row++) {
            int ans=1;
                System.out.print(ans+" ");
                for (int i = 1; i <row; i++) {
                ans*=row-i;
                ans/=i;
                System.out.print(ans +" ");
            }
                System.out.println();
        }
    }

}
