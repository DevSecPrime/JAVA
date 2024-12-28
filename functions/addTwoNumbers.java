package functions;

import java.util.Scanner;

public class addTwoNumbers {

    // sum
    public static int calculateSum(int a, int b) {

        int sum = a + b;
        return sum;
    }

    public static int calculateMultiplication(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {

        // take input from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("\n Enter the value of b: ");
        int b = sc.nextInt();

        // call function
        int sum = calculateSum(a, b);
        int product = calculateMultiplication(a, b);
        System.out.println("Sum of " + a + " + " + b + " is :" + sum);
        System.out.println("Product of " + a + " * " + b + " is :" + product);
    }
}