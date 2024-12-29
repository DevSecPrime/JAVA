import java.util.Scanner;

public class GreatestCommonDevisor {

    // Enter the value of number1: 81
    // Enter the value of number2: 153
    // Greatest common devisor of 81 and 153 is: 9

    public static int getGreatestCommonDevisor(int number1, int number2) {
        // int gcd = 1;
        // using for loop is not a better approach, for better approach you can use
        // while loop
        // for (int i = 1; i <= number1 && i <= number2; i++) {
        // if (number1 % i == 0 && number2 % i == 0) {
        // gcd = i;
        // }
        // }
        // return gcd;

        while (number1 != number2) {
            if (number1 > number2) {
                number1 = number1 - number2;
            }

            if (number2 > number1) {
                number2 = number2 - number1;
            }

        }

        // we can return any of the number , number1 or number2
        return number1;

    }

    public static void main(String args[]) {
        // get input from user of two numbers
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of number1 :");
        int number1 = sc.nextInt();

        System.out.print("Enter the value of number2 :");
        int number2 = sc.nextInt();

        // calling function
        int gcdNumber = getGreatestCommonDevisor(number1, number2);

        System.out.print("Greatest common devisor of " + number1 + " and " + number2 + " is :" + gcdNumber);

    }

}