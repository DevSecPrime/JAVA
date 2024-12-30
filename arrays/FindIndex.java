package arrays;

import java.util.Scanner;

public class FindIndex {
    // function to find the index of the array
    public static void findIndexOfArrayElement(int size) {
        // take array input from the user \
        // Enter the size of the array: 5
        // 12 32 33 64 45
        // Enter, of which element you want to find the index :33
        // X is found at he array index of :2

        int numbers[] = new int[size];
        Scanner sc = new Scanner(System.in);
        // take input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // enter which element you want to find\
        System.out.print("Enter, of which element you want to find the index :");
        int x = sc.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (x == numbers[i]) {
                System.out.print("X is found at he array index of :" + i);
            }
        }
        return;
    }

    public static void main(String args[]) {
        // take size of the array from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // call the function
        findIndexOfArrayElement(size);

    }
}
