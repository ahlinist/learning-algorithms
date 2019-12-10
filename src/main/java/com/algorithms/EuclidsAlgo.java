package com.algorithms;

public class EuclidsAlgo {

    private static int counter = 0;

    public static void main(String... args) {
        long i = 8024713123123123127l;
        long j = 9024712234234234233l;

        long result = (i >= j) ? run(i, j) : run(j, i);
        System.out.println(result);
        System.out.println("counter: " + counter);
    }

    private static long run(long i, long j) {
        counter++;
        long result = i % j;
        return (result == 0) ? j : run(j, result);
    }
}
