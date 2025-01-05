package bitManipulation;

import java.util.Scanner;

public class UpdateBit {
    // Update the from 2nd bit (position = 2) from the number n to 0; n = 0101
    // For 0 --> clear operation
    // NOT with AND, first perform NOT then AND
    // For updating 1 --> set operation
    // OR operation

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which operation you want to perform, select from 0 & 1 : ");
        int operation = sc.nextInt();
        // operation: 1 ---> set operation OR
        // operation: 0 -----> clear operation AND with OR

        int n = 5;// 0101
        int position = 1;
        int bitMask = 1 << position;
// System.out.println(bitMask);
        if (operation == 1) {
            // set operation
            int newNumber = bitMask | n;
            System.out.print("bit is updated to 1, ans is :" + newNumber);
        } else {
            // clear operation
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.print("bit updated to 0, ans is :" + newNumber);
        }
    }

}
