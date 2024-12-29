package functions;

import java.util.Scanner;

public class printMyNameFumction {

    // definition of function
    public static void printMyName(String name) {

        System.out.println(" your name is: " + name);
        return;
    }

    public static void main(String args[]) {

        // take input from user
        System.out.print("Please enter your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        // Call function
        printMyName(name);
    }
}
