package functions;

import java.util.Scanner;

public class average {

    // function to print average of given n numbers
    public static void printAverage(int n) {
        System.out.println("Enter " + n + " numbers");
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= n; i++) {
            double number = sc.nextDouble();
            sum = sum + number;
        }
        double average = sum / n;
        System.out.println("Average of given " + n + " numbers :" + average);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // take number i/p from user
        System.out.print("Enter how many of numbers you wan to find average :");
        int n = sc.nextInt();

        // call function
        printAverage(n);
    }
}
