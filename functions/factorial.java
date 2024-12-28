package functions;

import java.util.Scanner;

public class factorial {

    // function for finding factorial
    public static int findFactorial(int n) {
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of factorial number that you want to find: ");
        int n = sc.nextInt();

        // calling function
        int factorialNumber = findFactorial(n);
        System.out.println("Factorial of given number" + n + " is: " + factorialNumber);
    }
}
