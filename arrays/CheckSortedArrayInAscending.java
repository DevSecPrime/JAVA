package arrays;

import java.util.Scanner;

public class CheckSortedArrayInAscending {
    // Problem statement
    // Take an array of numbers as input and check if it is an array sorted in
    // ascending order.
    // Eg:
    // { 1, 2, 4, 7 } is sorted in ascending order. {3, 4, 6, 2} is not sorted in
    // ascending order.

    ///function to find that array is sorted or not
    public static void getAscendingSortedArray(int size) {

        // output
        // Enter the size of the array: 5
        // 2 5 8 0 9
        // Array is not sorted in ascending order

        // Enter the size of the array: 5
        // 1 2 5 8 9
        // Array is sorted in ascending order

        // initialize the array
        int numbers[] = new int[size];

        // take inputs from the user
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // logic to find array is sorted or not
        boolean isSortedInAscending = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                isSortedInAscending = false;
            }
        }

        if (isSortedInAscending) {
            System.out.println("Array is sorted in ascending order.");
        } else {
            System.out.println("Array is not sorted in ascending order.");
        }
    }

    public static void main(String args[]) {

        // take size of the array from the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // calling function for getting sorted array
        getAscendingSortedArray(size);

    }
}
