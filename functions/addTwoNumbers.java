package functions;

import java.util.Scanner;

public class addTwoNumbers {

    public static void sum(int a, int b) {
        System.out.print("Sum of " + a + "+" + b + " is :");
        int add = a + b;
        System.out.print(add);
        return;
    }

    public static void main(String[] args) {

        // take input from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("\n Enter the value of b: ");
        int b = sc.nextInt();

        // call function
        sum(a, b);
    }
}