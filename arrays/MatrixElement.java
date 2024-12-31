package arrays;

import java.util.Scanner;

public class MatrixElement {
    // Note: array index will be starting from the (0,0), here

    // Enter row size of the 2D array:4
    // Enter column size of the 2D array:5

    // 1 2 5 6 8
    // 11 32 45 78 24
    // 8 9 12 10 11
    // 15 16 17 18 13

    // Matrix/2D array output:
    // 1 2 5 6 8
    // 11 32 45 78 24
    // 8 9 12 10 11
    // 15 16 17 18 13

    // Enter the value of X from the 2D array, that you want to find:13
    // Element x = 13 found on index in Matrix/2D array:(3,4)

    // function to find the index from the 2D array/ matrix
    public static void find2DArrayElement(int rows, int columns) {

        Scanner sc = new Scanner(System.in);
        // initialize the array
        int numbers[][] = new int[rows][columns];

        // take input from the user
        // outer loop ---> rows
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // matrix output
        System.out.println("Matrix/2D array output : ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        // Element index that you want ot find from the 2D Array/ matrix
        System.out.print("Enter the value of X from the 2D array, that you want to find : ");
        int x = sc.nextInt();

        boolean isFound = false;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (x == numbers[i][j]) {
                    System.out.print("Element x = " + x + " found on index in Matrix/2D array : (" + i + "," + j + ")");
                    isFound = true;
                }
            }
        }
        if (!isFound) {
            System.out.println("X element`s array index is not found in Matrix");
        }

    }

    public static void main(String args[]) {
        // take row size and column size from the user

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row size of the 2D array : ");
        int rows = sc.nextInt();

        System.out.print("Enter column size of the 2D array : ");
        int columns = sc.nextInt();

        // call function
        find2DArrayElement(rows, columns);
    }

}
