package loops;

public class infiniteDoWhile {
    public static void main(String args[]) {

        // Write an infinite loop using do while condition.
        int n = 1;
        int i = 1;
        do {

            System.out.println(i);
            i++;
            n++;
        } while (i <= n);
    }
}
