package recursion;

public class RecursionPrintFactorial {
    // Print n factorial, n = 5

    // 5! = 5 * 4 * 3 * 2 * 1
    //    = 5 * (5 - 1)! ==> n*(n-1)!
    //    = 5 * 4!

    public static int calculateFactorial(int n) {

        // base condition
        if (n == 1 || n == 0) {
            return 1;
        }

        int fact_nm1 = calculateFactorial(n - 1);
        int fact_n = n * fact_nm1;// ---> n*(n-1)
        return fact_n;
    }

    public static void main(String args[]) {
        // calling function
        int factorialOfN = calculateFactorial(5); // Factorial of given n : 120
        System.out.println("Factorial of given n : " + factorialOfN);

    }
}
