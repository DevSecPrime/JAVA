package leetcode;

import java.util.Scanner;

public class SpiralMatrix {

    public static void printSpiralMatrix(int rows, int columns) {
        Scanner sc = new Scanner(System.in);

        // initialize the array

        int matrix[][] = new int[rows][columns];

        // take matrix input from the user
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // printing
        System.out.println();
        System.out.println("Printing the " + rows + "X" + columns + " matrix : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // 1. logic
        // 2. while loop condition startRow <= endRow && startColumn <= endColumn --> to
        // avoid duplication
        // 3. conner --> while swapping

        // Enter the rows size : 4
        // Enter the column size : 4
        // 1 2 3 4 
        // 5 6 7 8 
        // 9 10 11 12 
        // 13 14 15 16

        // Printing the 4X4 matrix : 
        // 1 2 3 4 
        // 5 6 7 8 
        // 9 10 11 12 
        // 13 14 15 16 

        // Printing spiral matrix    
        // 1 2 3 4 8 12 16 15 14 13 9 5 1 6 7 11 10 6 

        int startRow = 0;
        int endRow = rows - 1;
        int startColumn = 0;
        int endColumn = columns - 1;
        System.out.println();
        System.out.println("Printing spiral matrix ");
        while (startRow <= endRow && startColumn <= endColumn) {

            // top col0 --> col col-1 ===> total-1
            for (int j = startColumn; j <= endColumn; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endColumn] + " ");
            }

            // bottom
            for (int j = endColumn - 1; j >= startColumn; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            // left
            for (int i = endRow - 1; i >= startRow; i--) {
                if (startColumn == endColumn) {
                    break;
                }
                System.out.print(matrix[i][startColumn] + " ");
            }

            startRow++;
            startColumn++;
            endRow--;
            endColumn--;
        }
    }

    public static void main(String args[]) {
        // take input from the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows size : ");
        int rows = sc.nextInt();

        System.out.print("Enter the column size : ");
        int columns = sc.nextInt();

        // calling function to print spiral matrix
        printSpiralMatrix(rows, columns);

    }
}
