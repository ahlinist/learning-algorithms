package com.algorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String... args) {
        int[] array = new int[] {3,6,2,7,4,9,2,76,9,2345,4,9,0,3,-1,-5,-7,5,-98};

        for (int i = 0; i < array.length -1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int bubble = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = bubble;
                }
            }
        }

        Arrays.stream(array)
                .forEach(System.out::println);
    }
}
