package patterns;

public class butterfly_pattern {
    public static void main(String[] args) {
        // Butterfly pattern
        // *      *
        // **    **
        // ***  ***
        // ********
        // ********
        // ***  ***
        // **    **
        // *      *

        int n = 4;

        // 1 stage
        // outer loop
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                // print *
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                // print space
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                // print *
                System.out.print("*");
            }

            System.out.println();
        }

        // second part - lower part
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                // print *
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                // print space
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                // print *
                System.out.print("*");
            }

            System.out.println();
        }

    }
}