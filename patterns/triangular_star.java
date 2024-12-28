package patterns;

public class triangular_star {
    public static void main(String args[]) {
        int n = 5;
        
        //Traigngle star
        
        //     *
        //    ***
        //   *****
        //  *******
        // *********

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= 2 * (i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
