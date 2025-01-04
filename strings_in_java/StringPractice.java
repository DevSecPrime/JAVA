package strings_in_java;

import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {

        // String concatination: Tony Stark
        // Please enter your name: DevSec prime
        // Your name is: DevSec prime
        // The index of  "name"in string is: 11
        // t
        // h
        // i
        // s
        // i
        // s
        // m
        // y
        // n
        // a
        // m
        // e
        // D
        // e
        // v
        // S
        // e
        // c
        //string declaration
        String firstName = "Tony";
        String lastName = "Stark";

        //string concatenation
        String fullName = firstName + " " + lastName;
        System.out.println("String concatination: " + fullName);

        //take string input from user
        Scanner sc = new Scanner(System.in);
        // String name = sc.next() //will give yiu single word given as inout in string;

        System.out.print("Please enter your name: ");
        String name = sc.nextLine(); //use nextLine to print full name

        System.out.println("Your name is: " + name);

        //find string index
        String target = "this is my name DevSec";

        System.out.println(
                "The index of  \"name\"in string is: " + target.indexOf("name"
                ));

        //char at
        for (int i = 0; i < target.length(); i++) {
            System.out.println(target.charAt(i));
        }

    }

}
