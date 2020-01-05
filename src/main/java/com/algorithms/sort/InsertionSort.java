package com.algorithms.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String... args) {
        int[] array = new int[] {3,6,2,7,4,9,2,76,9,2345,4,9,0,3,-1,-5,-7,5,-98, 5, 6, 9,1,56,5678,-54,3,-98,-7,4,1,5};
        long initialTime = System.nanoTime();

        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                --j;
            }

            array[j + 1] = current;
        }

        long finalTime = System.nanoTime();
        Arrays.stream(array)
                .forEach(System.out::println);
        System.out.println("Time consumed: " + (finalTime - initialTime));
    }
}
