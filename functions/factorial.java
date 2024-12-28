package functions;

import java.util.Scanner;

public class factorial {

    // function for finding factorial
    public static void findFactorial(int n) {
        // if n < 0

        if (n < 0) {
            System.out.println("Invalid number");
            return;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of given number" + n + " is: " + factorial);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of factorial number that you want to find: ");
        int n = sc.nextInt();

        // calling function
        findFactorial(n);

    }
}
