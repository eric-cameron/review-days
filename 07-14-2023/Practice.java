package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        // Counting up from 0 to 4
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // Counting down from 100 to 0 by 25s
        System.out.println("Counting down from 100 to 0 by 25.");
        for (int i = 100; i >= 0; i-=25) {
            System.out.println(i);
        }

        System.out.println("If your conditions are wrong, the loop may never run.");
        for (int i = 25; i < 1; i++) {
            System.out.println("I never run :( ");
        }

        System.out.println("The other alternative is the loop can never end");
        // Leaving this commented out because, you know, infinite
//        for (int i = 0; i < 25; i--) {
//            System.out.println("This is the program that never ends.");
//        }

        // Find the average value of all numbers between two numbers a user gives us.
        Scanner input = new Scanner(System.in);

        System.out.println("We're going to average values for you.");
        System.out.print("What is the low number: ");
        // We do our input as a String, then convert to int
        String lowValueString = input.nextLine();
        int lowValueInt = Integer.parseInt(lowValueString);
        // Could also do this in a single line of code
        // int lowValueInt = Integer.parseInt(input.nextLine());

        // Without the parentheses around lowValueInt + 4, this would print out the user's number and then the number 4
        // (so an input of 10 would print 104)
        System.out.println("Does the number do math? Let's add 4 to your number and see: " + (lowValueInt + 4) );

        System.out.print("What is the high number: ");
        String highValueString = input.nextLine();
        int highValueInt = Integer.parseInt(highValueString);

        int sum = 0;
        for (int i = lowValueInt; i <= highValueInt; i++) {
            sum += i;
        }
        double average = (double) sum / (highValueInt - lowValueInt + 1);

        System.out.println("I know I said AVERAGE, but here's the SUM for now: " + sum);
        System.out.println("And since you asked, the AVERAGE is: " + average);

        // Format the average as two decimal places
        // printf does not include a new line character so we will add that
        System.out.printf("The AVERAGE with two decimal places is %.2f\n", average);

        List<String> values = new ArrayList<>();
        values.add("Jim");
        values.add("Johnna");
        values.add("Connor");
        values.add("Foosh");

        // Print the first letter of each name of each person in our List
        for(String currentName : values){
            System.out.println(currentName.charAt(0));
        }

        // Equivalent loop using for i:
        for (int i = 0; i < values.size(); i++) {
            System.out.println(values.get(i).charAt(0));
        }

        System.out.println("Thanks for attending the review!");
    }
}
