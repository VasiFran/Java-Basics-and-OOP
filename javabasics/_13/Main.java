package javabasics._13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Add 8 random integers to the array list
     * <p>
     * Print out the first item
     * <p>
     * Remove the first 3 items
     * <p>
     * The print out the first remaining item
     */
    public static void exercise1() {
        System.out.println("Exercise 1:");
        ArrayList<Integer> numbers = new ArrayList<>();

        //Write your code here
        numbers.add(12);
        numbers.add(23);
        numbers.add(47);
        numbers.add(2);
        numbers.add(117);
        numbers.add(1);
        numbers.add(83);
        numbers.add(69);

        System.out.println(numbers.get(0));

        numbers.remove(0);
        numbers.remove(0);
        numbers.remove(0); // devo vedere se c'è un modo per rimuovere più di un indice dalla lista

        System.out.println(numbers.get(0));
    }

    /**
     * 2: Create 2 Array Lists,
     * <p>
     * A list of strings called 'menuItems'
     * <p>
     * And a list of Doubles called 'menuPrices'
     * <p>
     * The indexes of these two lists correspond to eachother
     * <p>
     * Create a print statement to output the name and price of each
     * menu item correspond
     */
    public static void exercise2() {
        System.out.println("\nExercise 2:");
        //Write your code here
        ArrayList<String> menuItems = new ArrayList<>();
        ArrayList<Double> menuPrices = new ArrayList<>();

        menuItems.add("Hamburger");
        menuItems.add("Chicken");
        menuItems.add("Salad");
        menuItems.add("Fries");
        menuItems.add("Milkshake");

        menuPrices.add(3.99);
        menuPrices.add(4.49);
        menuPrices.add(4.79);
        menuPrices.add(1.39);
        menuPrices.add(2.19);

        int menuOrder = 0;

        System.out.println("Order n: " + (menuOrder+1) + ". Item: " + menuItems.get(menuOrder) + ". Price: " + menuPrices.get(menuOrder));
    }

    /**
     * 3: I changed this to an int array after recording!
     * <p>
     * You'll still need to find the total but using [index] instead of .get(index)
     * <p>
     * Find the total sum of all items in the ArrayList below.
     * <p>
     * Use the + operator
     * <p>
     * print the total
     */
    public static void exercise3() {
        System.out.println("\nExercise 3:");
        int[] items = new int[]{5, 10404, -234348, -53, 9, 91, 92, 34534, 12334, 1435};

        //Write your code here
        int sum = 0;

        for(int i = 0; i < items.length; i++ ){
            sum += items[i];
        }
        System.out.println(sum);
        // ho usato il ciclo for, mi sembrava la soluzione più comodo anche se ancora non è stato spiegato
        // su Java, farò anche la versione senza for.

        sum = 0;

        sum = sum + items[0] + items[1] + items[2] + items[3] + items[4] +
                    items[5] + items[6] + items[7] + items[8] + items[9];

        System.out.println(sum);
    }
}
