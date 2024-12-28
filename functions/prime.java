package functions;

import java.util.Scanner;

public class prime {

    public static void checkPrime(int n) {
        if (n == 0 || n < 0 || n == 1) {
            System.err.println("Invalid number");
        }

        int count = 0;

        // for i --> n
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++; // count will be to for n/1 & n/n ==> 2
            }
        }
        if (count == 2) {
            System.out.println("PRIME NUMBER");
        } else {
            System.out.println("NUMBER IS NOT PRIME");
        }

    }

    public static void main(String args[]) {

        // input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of number that you want to check: ");
        int n = sc.nextInt();

        // call function
        checkPrime(n);
    }
}
