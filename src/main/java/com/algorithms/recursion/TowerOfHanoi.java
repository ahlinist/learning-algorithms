package com.algorithms.recursion;

public class TowerOfHanoi {

    public static void main(String... args) {
        TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
        towerOfHanoi.move(4, 'A', 'C', 'B');
    }

    private void move(int number, char from, char to, char med) {
        if (number == 1) {
            System.out.println("Moving disc 1 from tower A to tower C");
        } else {
            move(number - 1, from, med, to);
            System.out.println("Moving disc " + number + " from tower " + from + " to tower " + to);
            move(number - 1, med, to, from);
        }
    }
}
