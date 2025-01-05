package strings;

import java.util.Scanner;

public class ExtractUsernameFromEmail {

// Enter your email address: devsecprime58@outlook.com
// Your username is: devsecprime58
    public static void main(String[] args) {

        //input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your email address: ");
        String email = sc.nextLine();

        //extract username from email
        int atIndex = email.indexOf("@");

        //provide user name
        String userName = email.substring(0, atIndex);
        System.out.println("Your username is: " + userName);
    }
}
