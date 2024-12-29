package functions;

import java.util.Scanner;

public class CountPositiveNegativeZeros {
    // Write a program to enter the numbers till the user wants and at the end it
    // should display the count of positive, negative and zeros entered.

    // Enter n inputs:5
    // 0 0 -2 -5 6
    // The counts
    // of Zero`s (0`s) is: 2
    // The counts of negative number is: 2
    // The counts of positive number is: 1

    public static void getCountPositiveNegativeZeros(int n) {
        int number;
        int zerosCount = 0;
        int negativeCount = 0;
        int positiveCount = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= n; i++) {
            number = sc.nextInt();

            if (number == 0) {
                zerosCount++;

            } else if (number < 0) {
                negativeCount++;

            } else {
                positiveCount++;

            }
        }
        System.out.println("The counts of Zero`s (0`s) is: " + zerosCount);
        System.out.println("The counts of negative number is: " + negativeCount);
        System.out.println("The counts of positive number is: " + positiveCount);
    }

    public static void main(String args[]) {
        // take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n inputs: ");
        int n = sc.nextInt();

        // call function
        getCountPositiveNegativeZeros(n);

    }

}
