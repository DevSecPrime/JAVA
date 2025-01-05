package strings;

import java.util.Scanner;

public class CumulativeStringLength {

    //output
    //  Enter the first string: hello
    // Enter the second string: java
    // Enter the third string: this is prime
    // Cumulative length of the given strings: 22

    // function to calculate cumulative length of 3 strings -- str1, str2, str3
    public static void getCumulativeStringLength(String str1, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        sb.append(str2);
        sb.append(str3);
        int cumulativeLength = sb.length();
        System.out.println("Cumulative length of the given strings: " + cumulativeLength);  // prints: Cumulative length of the given strings: 16
    }

    public static void main(String[] args) {

        //Take 3  strings as input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        System.out.print("Enter the third string: ");
        String str3 = sc.nextLine();

        // calculate cumulative length -- calling function 
        getCumulativeStringLength(str1, str2, str3);
    }
}
