package patterns;

public class halfPyramid {

    public static void main(String args[]) {
        int n = 5;

        // Half Pyramid
        // *
        // * *
        // * * *
        // * * * *

        // outer loop - row
        for (int i = 1; i < n; i++) {
            // inner loop - column
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
