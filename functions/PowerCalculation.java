
import java.util.Scanner;

public class PowerCalculation {

    // Two numbers
    // are entered
    // by the user,
    // x and
    // n.Write a
    // function to
    // find the
    // value of
    // one number
    // raised to
    // the power
    // of another i.e.x`n.

    // out put
    // Enter the value of x: 2
    // Enter the value of x`n n: 4
    // value of x raised to n===>2`4: 16

    public static void calculatePower(int x, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            // System.out.println(x);
            // System.out.println("result" + result);
            result = result * x;

        }

        System.out.println("value of x raised to n ===> " + x + "`" + n + " :" + result);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();

        System.out.print("Enter the value of x`n  n: ");
        int n = sc.nextInt();

        // call function
        calculatePower(x, n);
    }
}
