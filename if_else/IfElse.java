package if_else;

import java.util.Scanner;

public class IfElse {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if (age >= 18) {
            System.out.print("You are adult, your age is " + age);
        } else {
            System.out.print("You are not adult, your age is " + age);
        }
    }
}
