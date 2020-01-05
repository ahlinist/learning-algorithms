package com.algorithms.recursion;

public class Factorial {

    public static void main(String... args) {
        int n = 2;
        int result = iteration(n);
        System.out.println("Result: " + result);
    }

    public static int iteration(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input can't be a negative value");
        }

        if (n == 1 || n == 0) {
            return 1;
        }
        return n * iteration(n - 1);
    }
}
