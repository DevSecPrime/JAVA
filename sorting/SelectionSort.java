package sorting;

import java.util.Scanner;

public class SelectionSort {
    // selection sort
    // the lowest element will be stored first
    // 1st lowest, 2nd lowest, 3rd lowest...
    // n-1, n-2, n-3,..... O(n`2) time complexity

    // Enter the size of the array:5
    // Enter 5 element of the array
    // 7 8 3 1 2
    // Printing sorted array:1 2 3 7 8

    public static void printSortedArray(int arr[]) {
        System.out.println("Printing sorted array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        System.out.println("Enter " + size + " element of the array: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        ///Selection sort algorithm
        // outer loop will run from ---- for(i = 0 to arr.length - 1)
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            // Swap element with smallest one
            int temp = arr[smallest];// arr[smallest] will be empty
            arr[smallest] = arr[i]; // now a[i] will be empty
            arr[i] = temp;// stored temp value in arr[i], then it became empty
        }
        printSortedArray(arr);
    }
}
