package arrays;

import java.util.Scanner;

public class ArrayUserInput {

    // function to get array
    public static void checkArray(int size) {

        // initialize the array
        int numbers[] = new int[size];

        Scanner sc = new Scanner(System.in);
        // loop for get input
        // Note: always start array from 0th index..
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // output loop
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void main(String args[]) {

        // take size of the array of the from the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();

        // call function
        checkArray(size);

    }

}
