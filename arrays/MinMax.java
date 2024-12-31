package arrays;

import java.util.Scanner;

public class MinMax {

    // find min and max element from the array
    // Enter the size of the array:5
    // -2 -6 5 9 2
    // MAX ELEMENT OF THE ARRAY :9
    // MIN ELEMENT OF THE ARRAY : -6

    public static void findMinMaxOfArray(int size) {
        Scanner sc = new Scanner(System.in);
        // initialize the array
        int numbers[] = new int[size];

        // take input form the user
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // get min & max values from the array

        // int min = numbers[0];
        // int max = numbers[0];

        // for better approach in java
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length - 1; i++) {

            ///check if 0th index value of array is less than min value
            if (numbers[i] < min) {
                min = numbers[i];
            }

            ///check if 0th index value of array is greater than min value
            if (numbers[i] > max) {
                max = numbers[i];
            }

        }

        System.out.println("MAX ELEMENT OF THE ARRAY : " + max);
        System.out.println("MIN ELEMENT OF THE ARRAY : " + min);
    }

    public static void main(String args[]) {
        // Min Max problem in java

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        ///call function 
        findMinMaxOfArray(size);

    }
}
