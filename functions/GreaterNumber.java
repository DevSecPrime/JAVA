package functions; // Replace with your correct package name

import java.util.Scanner;

public class GreaterNumber {

    // a function which takes in 2 numbers and returns the greater of those two.
    public static void getGreaterNumberFromTwo(int n1, int n2) {

        //get first greater number from the both of the numbers
        int result;
        if (n1 > n2) {
            result = n1;
        } else {
            result = n2;
        }
        System.out.println("GREATER NUMBER FROM TWO NUMBERS IS :" + result);

        //print the grater number from  both of thr numbers
        int greatestNumberFromBoth = result + 1;

        System.out.println("GREATER NUMBER FROM BOTH NUMBERS IS :" + greatestNumberFromBoth);
    }

    public static void main(String[] args) {
        //get input from user of two numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n1 : ");  // this is the number of inputs you want to enter. For example, if you want to enter 2 numbers, enter 2 here.
        int n1 = sc.nextInt();

        System.out.print("Enter the value of n2 : ");  // this is the number of inputs you want to enter. For example, if you want to enter 2 numbers, enter 2 here.
        int n2 = sc.nextInt();

        // call function
        getGreaterNumberFromTwo(n1, n2);

    }

}
