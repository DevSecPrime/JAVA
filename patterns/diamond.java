package patterns;

public class diamond {
    public static void main(String args[]) {
        // Diamnod pattern
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        
        // Outer loop
        int n = 5;

        // upper loop
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= 2 * (i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower loop
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
