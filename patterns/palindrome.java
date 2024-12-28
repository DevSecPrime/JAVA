package patterns;

public class palindrome {
    public static void main(String args[]) {
        // Palindrome Pattern
        //     1
        //    212
        //   32123
        //  4321234
        // 543212345

        int n = 5;

        ///outer loop
        for (int i = 1; i <= n; i++) {
            // first loop for(j --->n-i) to print the space

            for (int j = 1; j <= n - i; j++) {
                // space
                System.out.print(" ");
            }

            // second loop for LEFT PART --> for( j = i to j>=1)
            for (int j = i; j >= 1; j--) {
                // LEFT PART
                System.out.print(j);
            }

            // third loop for printing RIGHT PART ---> for (j = 2 to j<=i)
            for (int j = 2; j <= i; j++) {
                // RIGHT PART
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
