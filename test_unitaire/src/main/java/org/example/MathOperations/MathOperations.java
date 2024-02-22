package org.example.MathOperations;

public class MathOperations {
    public int subtract(int numberOne, int numberTwo) {
        if (numberOne < numberTwo)
            throw new IllegalArgumentException("Second parameter cannot be higher than first parameter");

        if (numberOne >= 1200)
            throw new IllegalArgumentException("First parameter cannot be higher or equal to 1200");

        return numberOne - numberTwo;
    }

    public String getColorFromOddsNumber(int number) {
        if (number < 0)
            throw new IllegalArgumentException("Limit argument can't be negative");

        if (number % 2 == 0)
            return "Red";

        return "Blue";
    }
}
