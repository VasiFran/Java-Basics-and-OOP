package javabasics._6;

public class Main {
    // Don't forget to use comments to clear things up if you need them!
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
    }

    /**
     * 1: Create a double variable called value, create another double variable called valueSquareRoot
     *
     *    Use Math.sqrt to find the square root of value and assign it to valueSquareRoot
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        double value = 555;
        double valueSquareRoot = Math.sqrt(value);

        System.out.println("Value: " + value + ". Square root of value: " + valueSquareRoot);
    }

    /**
     * 2: See the code below
     *
     *    Print out the highest value using Math.max()
     *
     *    Then print out the lowest value using Math.min()
     *
     *    You must put your variables into these methods and separate them with a comma
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        int valueA = 5;
        int valueB = 10;

        System.out.println("Max= " + Math.max(valueA, valueB));
        System.out.println("Min= " + Math.min(valueA, valueB));

        // Write your code here
    }

    /**
     * 3: Use Modulus (%) to calculate the remaining amount of money if we buy as many burgers as possible, print remainder
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        int totalMoney = 50;
        int costPerBurger = 9;
        // Write your code here
        System.out.println("Numbers of burgers bought= " + totalMoney / costPerBurger);
        System.out.println("Remainder= " + totalMoney % costPerBurger);
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * I've chosen loads of methods from the Math Library, write comments above each line to guess what they do!
     *
     * You do not need to write any code
     *
     * Answers can be found in resources
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4 (Bonus!):");

        double ourValue = 4.5;

        // Arrotonda il numero per eccesso
        System.out.println(ourValue + " after using ceiling=" + Math.ceil(ourValue));
        // Arrotonda il numero per difetto
        System.out.println(ourValue + " after using floor=" + Math.floor(ourValue));
        // Arrotonda un numero e dà un intero
        System.out.println(ourValue + " after using round=" + Math.round(ourValue));
        // potenza di value per 2
        System.out.println(ourValue + " after using powerOf with the value of 2=" + Math.pow(ourValue, 2));
        // potenza di value per 3
        System.out.println(ourValue + " after using powerOf with the value of 3=" + Math.pow(ourValue, 3));
        // Moltiplica un numero casuale con ourValue
        System.out.println(ourValue + " times random =" + Math.random() * ourValue);
    }
}