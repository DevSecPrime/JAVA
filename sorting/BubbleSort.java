package sorting;

import java.util.Scanner;

public class BubbleSort {

    // Print size of the array: 5
    // Enter 5 elements: 7 8 1 3 2
    // Printing sorted element: 1 2 3 7 8

    public static void printArray(int arr[]) {

        System.out.print("Printing sorted element: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // take size of the array
        Scanner sc = new Scanner(System.in);

        System.out.print("Print size of the array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // bubble sort
        // Time Complexity --> O(n`2)
        // outer loop is counter loop --- for(i=1 to size-1)
        for (int i = 1; i < arr.length - 1; i++) {
            // inner loop
            for (int j = 0; j <= arr.length - i - 1; j++) // n-1, n-2, ....
            {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j]; // now a[j] became empty
                    arr[j] = arr[j + 1];// now a[j+1] became empty
                    arr[j + 1] = temp;// at last value of temp will be store in a[j+1] and then temp became empty
                }

            }
        }

        printArray(arr);
    }
}
