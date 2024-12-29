package functions;

import java.util.Scanner;

public class FibonacciSeries {

    // Enter first n fibonacci numbers:8
    // Fibonacci Series:0 1 1 2 3 5 8 13

    public static void getFibonacciSeries(int n) {
        int a = 0;
        int b = 1;
        int fibonacciNumbers;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            fibonacciNumbers = a + b;
            a = b;
            b = fibonacciNumbers;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first n fibonacci numbers :");
        int n = sc.nextInt();

        // call function
        getFibonacciSeries(n);
    }
}
