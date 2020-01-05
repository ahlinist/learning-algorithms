package com.algorithms.recursion;

public class TailRecursionFactorial {

    public static void main(String... args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        return factorial(n, 1);
    }

    public static int factorial(int n, int result) {
        if (n == 0 || n ==1) {
            return result;
        }

        return factorial(n - 1, n * result);
    }
}
