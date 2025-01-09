package recursion;

public class RecursionTest1 {
    // Recursion in java: when function calls it self is called as recursion.
    // function will called itSelf until it`s reached to base condition
    // it occupies more memory space than loop iteration
    public static void printNumber(int n) {

        // base condition
        if (n == 0) {
            return;
        }

        System.out.println(n);
        // function calls it self called as recursion
        printNumber(n - 1);
    }

    public static void main(String args[]) {
        int n = 5;
        // call function
        printNumber(n);
    }
}
