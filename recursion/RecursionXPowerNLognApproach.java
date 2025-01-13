package recursion;

public class RecursionXPowerNLognApproach {

    public static int calcPower(int x, int n) {

        if (n == 0) { // base case 1
            return 1;
        }
        if (x == 0) {// base case 2
            return 0;
        }

        if (n % 2 == 0) { // for even
            return calcPower(x, n / 2) * calcPower(x, n / 2);
        } else { // for odd
            return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
        }

    }

    public static void main(String args[]) {
        int x = 2;
        int n = 7;

        int ans = calcPower(x, n);
        System.out.println("Power of given x`n is logN height : " + ans); // Power of given x`n is logN height : 128
    }
}
