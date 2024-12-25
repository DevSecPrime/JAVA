package patterns;

public class halfPyaramidNumber {
    public static void main(String argsp[]) {

        // Half-Pyramid with number
        // 1
        // 12
        // 123
        // 1234
        // 12345

        int n = 5;
        System.out.println("Half-Pyramid with number");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // 1
        // 22
        // 333
        // 4444
        // 55555
        System.out.println("\n Half-Pyramid with number inverted");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // Inverted Half-Pyramid with number
        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1
        System.out.println("Inverted Half-Pyramid with number");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
