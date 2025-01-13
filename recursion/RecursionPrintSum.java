package recursion;

public class RecursionPrintSum {

    // Sum of first n numbers; here, n = 5;
    // Sum of given n numbers: 15
    public static void printSum(int i, int n, int sum) {

        // base condition when i == n; 5==5
        if (i == n) {
            sum += i; // previous sum = 1+2+3+4 then, sum + i --> sum + 5 ----> 1+2+3+4+5
            System.out.println("Sum of given n numbers: " + sum); // prints--> 1 + 2 + 3 + 4 + 5 => 15
            return;
        }
        sum += i; // sum = 0 & i = 1 so 0+1=> 1 and so on
        printSum(i + 1, n, sum); // ui = 1 but need to increase the value of i + 1 ; i = i+1
    }

    public static void main(String[] args) {
        // call recursive function directly
        printSum(1, 5, 0);
    }
}
