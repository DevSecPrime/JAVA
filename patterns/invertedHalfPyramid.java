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

        // outer loop
        for (int i = n; i >= 1; i--) {
            //Inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
