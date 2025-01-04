package strings;

import java.util.Scanner;

public class ReplaceString {

    // Enter the string:  DevSecPrime
    // which character you want to replace the string: e
    // With which character you want to replace the string: a
    // given string: DevSecPrime
    // Your Replace character: e
    // Your string will be replaced with : a
    // Modified string: DavSacPrima
    public static String getReplaceStringCharacter(String str, char ch, char replacingCh) {
        //replace character
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ch) {
                sb.setCharAt(i, replacingCh);
            }
        }

        return sb.toString();

    }

    public static void main(String[] args) {

        //scanner
        Scanner sc = new Scanner(System.in);

        //input
        System.out.print("Enter the string:  ");
        String str = sc.nextLine();

        //enter the character that you want to replace
        System.out.print("which character you want to replace the string: ");
        char ch = sc.next().charAt(0);

        System.out.print("With which character you want to replace the string: ");
        char replacingCh = sc.next().charAt(0);

        System.out.print("given string: " + str + "\n" + "Your Replace character: " + ch + "\n" + "Your string will be replaced with : " + replacingCh);

        //calling the function to replace the  string
        String result = getReplaceStringCharacter(str, ch, replacingCh);
        System.out.print("\nModified string: " + result);
    }
}
