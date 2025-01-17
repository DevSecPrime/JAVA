package patterns;

public class numberPyramid {
    public static void main(String args[]) {
        // number pyramid
        //     1
        //    2 2
        //   3 3 3
        //  4 4 4 4
        // 5 5 5 5 5

        int n = 5;
        for (int i = 1; i <= n; i++) {
            // print space n-i
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print *
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

}
