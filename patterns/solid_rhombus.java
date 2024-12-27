package patterns;

public class solid_rhombus {
    public static void main(String args[]) {
        // Solid Rhombus.
        //     ****
        //    ****
        //   ****
        //  ****
        int n = 4;

        /** Outer loop */
        System.out.println(" Solid Rhombus. \n");
        for (int i = n; i >= 1; i--) {
            // for space
            for (int j = 1; j <= i; j++) {
                System.out.print(' ');
            }
            // for *
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        
        //  ****
        //   ****
        //    ****
        //     ****
        System.out.println(" \n Solid Rhombus. 80 degree \n");
        for (int i = 1; i <= n; i++) {
            // for space
            for (int j = 1; j <= i; j++) {
                System.out.print(' ');
            }
            // for *
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
