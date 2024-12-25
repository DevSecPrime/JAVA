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
                System.out.print(j);
            }
            System.out.println();
        }

        // 1
        // 22
        // 333
        // 4444
        // 55555
        System.out.println("Half-Pyramid with number");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
