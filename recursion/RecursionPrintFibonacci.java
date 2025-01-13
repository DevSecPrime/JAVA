package recursion;

public class RecursionPrintFibonacci {
    // fibonacci series: 0, 1, 1, 2, 3, 5, 8,...
    // Fibonacci series of given n numbers: 0 1 1 2 3 5 8
    public static void calculateFibonacciSeries(int a, int b, int n) {

        // base condition
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        calculateFibonacciSeries(b, c, n - 1); // after c = a + b , acc to function b becomes a and c becomes b

    }

    public static void main(String args[]) {
        int a = 0;
        int b = 1;
        System.out.print("Fibonacci series of given n numbers: ");
        System.out.print(a + " ");
        System.out.print(b + " ");

        int n = 7;
        calculateFibonacciSeries(a, b, n - 2); // we already have known that, what will be the first two terms 0, 1
                                               // that`s why here taken n-2
    }
}