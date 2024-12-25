package patterns;

public class invertedHalfPyramid {
    public static void main(String args[]) {
        // Inverted half Pyramid
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *
        int n = 5;

        System.out.println("Inverted Pyramid");
        // outer loop
        for (int i = n; i >= 1; i--) {
            // Inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        // Inverted Pyramid 80 degree --> 2 inner loops
        //         *
        //       * *
        //     * * *
        //   * * * *
        // * * * * *
        System.out.println("\n Inverted Pyramid 80 degree");
        // outer loop
        for (int i = 1; i <= n; i++) {
            // Innner loop --> space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Innner loop --> *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
