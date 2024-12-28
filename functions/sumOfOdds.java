package functions;

import java.util.Scanner;

public class sumOfOdds {

    public static void addOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            //get odd numbers first
            if (i % 2 != 0) {
                //add odd numbers  in sum
                System.out.println(i);
                sum = sum + i;
            }
        }
        //print sum of the all gor odd  numbers
        System.out.println("sum of odd numbers is: " + sum);
    }

    public static void main(String[] args) {
        // take input from the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n numbers: ");
        int n = sc.nextInt();

        // calling function to add odd numbers
        addOddNumbers(n);
    }
}
