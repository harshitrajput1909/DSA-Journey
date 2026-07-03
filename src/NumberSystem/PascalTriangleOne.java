//# Find an Element in Pascal's Triangle
//
//## Problem Statement
//
//Given a row number `R` and a column number `C`, find the element present at the specified position in Pascal's Triangle.
//
//Pascal's Triangle is a triangular array where each element is the sum of the two elements directly above it. The value at any position can be calculated using the combination formula:
//
// `nCr = n! / (r! * (n-r)!)`
//
//To optimize the calculation, the element can be computed iteratively without calculating factorials.
//
//## Example
//
//Input:
//Row = 6
//Column = 1
//
//Output: 1
//
//Explanation:
//The 1st element in the 6th row of Pascal's Triangle is `1`.
//
//Input:
//Row = 5
//Column = 3
//
//Output: 6
//
//Explanation:
//The 3rd element in the 5th row of Pascal's Triangle is `6`.
//
//## Approach
//
//* The element at a given position in Pascal's Triangle can be calculated using the combination formula.
//* Instead of computing factorials, use an iterative approach to calculate the value efficiently.
//* For each position, multiply by `(row - i)` and divide by `i` to generate the required element.
//
//## Algorithm
//
//1. Initialize `ans = 1`.
//2. Traverse from `i = 1` to `column - 1`.
//3. In each iteration:
//
//* Multiply `ans` by `(row - i)`.
//* Divide `ans` by `i`.
//4. After completing the loop, `ans` contains the required element.
//5. Print or return `ans`.
//
//## Time Complexity
//
//O(C)
//
//where `C` is the column number.
//
// ## Space Complexity
//
//O(1)
//
//## Concepts Used
//
//* Pascal's Triangle
//        * Combinatorics
//* Binomial Coefficients
//* Iterative Computation
package NumberSystem;

public class PascalTriangleOne {
    public static void main(String[] args) {
        int row=6;
        int col=3;
        int ans=1;
        for (int i = 1; i <col; i++) {
            ans*=row-i;
            ans/=i;

        }
        System.out.println(ans);
    }
}
