package variables;

import java.util.Scanner;

public class Variables {

    @SuppressWarnings("resource")
    public static void main(String args[]) {
        System.out.print("this is varibales \n");

        // variables

        

        int a = 25;
        int b = 556;

        int sum = a + b;
        System.out.println("Sum is: " + sum);

        // take import from user
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("this is your entered string:-" + name);
        //nextInt()
        //nextFloat()

    }
}