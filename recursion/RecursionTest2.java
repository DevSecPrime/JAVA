package recursion;

public class RecursionTest2 {
    public static void printNumber(int n) {

        // base condition
        if (n == 6) {
            return;
        }

        System.out.println(n);
        // function calls it self called as recursion
        printNumber(n + 1); // 1 ----> 5
    }

    public static void main(String args[]) {
        int n = 1;
        // call function
        printNumber(n);
    }
}
