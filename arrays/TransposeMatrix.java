package arrays;

import java.util.Scanner;

public class TransposeMatrix {

    // Print transpose of Matrix
    // Enter the row size of the array:2
    // Enter the column size of the array:3
    // 1 2 3
    // 4 5 6

    // Transpose of Matrix:
    // 1 4
    // 2 5
    // 3 6

    public static void printTransposeMatrix(int rows, int columns) {

        Scanner sc = new Scanner(System.in);

        // initialize the array
        int numbers[][] = new int[rows][columns];

        // take input from the user
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // printing transpose of the matrix
        System.out.println("\nTranspose of Matrix: ");
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row size of the array : ");
        int rows = sc.nextInt();

        System.out.print("Enter the column size of the array : ");
        int columns = sc.nextInt();

        // call function
        printTransposeMatrix(rows, columns);
    }
}
