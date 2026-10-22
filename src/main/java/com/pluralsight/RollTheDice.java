package com.pluralsight;

public class RollTheDice {
    public static void main(String[] args) {
        Dice dice1 = new Dice();
        int roll1;
        int roll2;

        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;
        int sumOfRoll1Roll2;

        for (int i = 1; i <= 100; i++) {
            // roll dice and calculate sum
            roll1 = dice1.roll();
            roll2 = dice1.roll();
            sumOfRoll1Roll2 = roll1 + roll2;

            //check and increment counter
            switch (sumOfRoll1Roll2) {
                case 2:
                    twoCounter++;
                    break;
                case 4:
                    fourCounter++;
                    break;
                case 6:
                    sixCounter++;
                    break;
                case 7:
                    sevenCounter++;
                    break;
            }
            System.out.printf("Roll %d:  %d - %d  Sum:  %d%n", i, roll1, roll2, sumOfRoll1Roll2);
        }

        // display counters
        System.out.println();
        System.out.println("Number of occurrences");
        System.out.println("Two Counter: " + twoCounter);
        System.out.println("Four Counter: " + fourCounter);
        System.out.println("Six Counter: " + sixCounter);
        System.out.println("Seven Counter: " + sevenCounter);

    }
}
