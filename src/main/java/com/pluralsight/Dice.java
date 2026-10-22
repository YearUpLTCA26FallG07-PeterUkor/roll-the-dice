package com.pluralsight;

import java.util.Random;

public class Dice {
    private int randomNumber;

    public Dice() {
        this.randomNumber = 0;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public int roll(){
        this.randomNumber = (int) (Math.random() * (6 - 1 + 1)) + 1;
        return randomNumber;
    }

}
