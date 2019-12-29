package com.algorithms;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String... args) {
        int[] array = new int[] {3,6,2,7,4,9,2,76,9,2345,4,9,0,3,-1,-5,-7,5,-98};
        long initialTime = System.nanoTime();

        for (int i = 0; i < array.length; i++) {
            int minIndex = i;

            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        long finalTime = System.nanoTime();
        Arrays.stream(array)
                .forEach(System.out::println);
        System.out.println("Time consumed: " + (finalTime - initialTime));
    }
}
