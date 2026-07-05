//# Sieve of Eratosthenes (Prime Number Generation) in Java
//
//This project implements the **Sieve of Eratosthenes**, an efficient algorithm for finding all prime numbers up to a given number **n**. Instead of checking each number individually for primality, the algorithm marks the multiples of every prime number as non-prime, leaving only the prime numbers unmarked.
//
//The implementation uses a boolean array where:
//
//        * `false` represents a potential prime number.
//* `true` represents a non-prime (composite) number.
//
//        ### Features
//
//* Efficient generation of all prime numbers up to a given limit.
//* Uses the **Sieve of Eratosthenes** algorithm.
//* Avoids repeated divisibility checks, making it much faster than the naive approach.
//* Beginner-friendly implementation for learning arrays and algorithms.
//        * Suitable for DSA practice, coding interviews, and competitive programming.
//
//### Time Complexity
//
//* **O(n log log n)**
//
//        ### Space Complexity
//
//* **O(n)**
//
        package Arrays;

public class SeiveOfEratosthenes {
    public static void main(String[] args) {
        int n=40;
        boolean [] arr= new boolean[n+1];
        sieve(arr,n);
    }
    static void sieve(boolean[] arr,int n){
        for (int i = 2; i*i <n ; i++) {
            if(arr[i]==false){
                for (int j = i*2; j <=n; j+=i) {
                    arr[j]=true;

                }
            }

        }

        for (int k = 2; k <=n; k++) {
            if(!arr[k]){
                System.out.println(k);
            }

        }
    }
}
