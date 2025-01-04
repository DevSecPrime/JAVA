package strings;

import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {
        //always remember string are immutable, hence can't be changed once created --> you can't change it if its stored 

        // String concatenation: Tony Stark
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
        //Compare two string
        String name1 = "Chris";
        String name2 = "Chris";
        //3 cases
        //1: s1<s2 --> returns -ve value
        //2 : s1>s2 --> returns +ve value
        //3 : s1==s2 --> returns 0
        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are EQUAL");
        } else {
            System.out.println("Strings are NOT EQUAL");
        }

        //using  == methods --> sometime this method gives false if two string objects are pointing to same memory location
        //example: this will true 
        // if (name1 == name2) {
        //     System.out.println("Strings are EQUAL");
        // } else {
        //     System.out.println("Strings are NOT EQUAL");
        // }
        //using new  this is return until it`s true
        // if (new String("prime") == new String("prime")) {
        //     System.out.println("Strings are EQUAL");
        // } else {
        //     System.out.println("Strings are NOT EQUAL");
        // }
        //Note: always use compareTo() or equals() method for string comparison in java
        //substring
        //subString(startIndex, endIndex)
        String text = "This is DevSecPrime";
        System.out.println("Substring: " + text.substring(8, 14)); //prints "DevSec"

        //convert string to  integer
        String stringNumbers = "582002";
        int numbers = Integer.parseInt(stringNumbers);

        System.out.println("String is converted to Integer: " + numbers);

    }

}
