package com.kevinsguides.introtojava.chapter03;

//remember that the Scanner must be imported from the Java libraries before we can use it
import java.util.Scanner;

/**
 * A basic calculator that asks the user to enter some values, then adds, subtracts, multiplies, and divides them.
 * @author Kevin's Guides - Kevin Olson
 * @since 10/16/2021
 * @version 1.00
 * License: Public Domain
 * Related Guide: https://kevinsguides.com/guides/code/java/javaintro/03variables
 */
public class BasicCalculator {

    public static void main(String[] args){

        //Introduce ourselves
        System.out.println("Welcome to Basic Calculator");

        //Create Scanner
        Scanner userInput = new Scanner(System.in);

        //Ask use to type first value
        System.out.println("Enter first value:");
        double x = userInput.nextDouble();

        //Ask use to type second value
        System.out.println("Enter second value:");
        double y = userInput.nextDouble();

        //Always remember to close the scanner when we're done with it
        userInput.close();

        //Calculate results and print to screen
        System.out.println("\nCalculating results...");
        double sum = x + y;
        System.out.printf("Sum: %.2f + %.2f = %.2f\n", x, y, sum);
        double difference = x - y;
        System.out.printf("Difference: %.2f - %.2f = %.2f\n", x, y, difference);
        double product = x * y;
        System.out.printf("Product: %.2f * %.2f = %.2f\n", x, y, product);
        double quotient = x / y;
        System.out.printf("Quotient: %.2f / %.2f = %.2f\n", x, y, quotient);

        //Challenge question: Can you do the above in fewer lines?

    }

}
