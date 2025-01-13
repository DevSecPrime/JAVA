package recursion;

public class RecursionXPowerN {

    // function
    public static int calcPower(int x, int n) {

        if (x == 0) { // base case 1
            return 0; // 2*2*0 --> 0
        }

        if (n == 0) {// base case 2
            return 1; // 2`0 --> 1
        }
        int xPowerNm1 = calcPower(x, n - 1);
        int xPowerN = x * xPowerNm1;
        return xPowerN;

    }

    public static void main(String args[]) {
        int x = 2;
        int n = 5;

        int ans = calcPower(x, n);
        System.out.println("Power of given x`n : " + ans);//Power of given x`n : 32
    }
}
