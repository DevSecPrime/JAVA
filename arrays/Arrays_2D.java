package arrays;

import java.util.Scanner;

public class Arrays_2D {
    // 2D Array practice

    public static void main(String args[]) {
        // take input from the user in terms of rows and columns

        // Enter rows of the array :2
        // Enter columns of the array :3
        // 5 6 9 2 3 8
        // Printing output matrix: 
        // 5 6 9
        // 2 3 8

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows of the array :");
        int rows = sc.nextInt();

        System.out.print("Enter columns of the array :");
        int columns = sc.nextInt();

        // initialize the array
        int numbers[][] = new int[rows][columns];

        // example: 2x3 array ---> 2 rows and 3 columns
        //       |col0|col1| col 2
        // row 0 | 1  | 2  | 3
        // row 1 | 4  | 5  | 6

        // for input
        // outer for loop prints -----> rows
        for (int i = 0; i < rows; i++) {
            // inner loop prints ----> columns
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // output print -- outer loop--> rows
        System.out.println("Printing output matrix: ");
        for (int i = 0; i < rows; i++) {
            // inner loop --> columns
            for (int j = 0; j < columns; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}
