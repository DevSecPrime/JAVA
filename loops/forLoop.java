package loops;

public class forLoop {
    public static void main(String args[]) {

        // for loop in java
        System.out.println("For loop");
        for (int count = 0; count < 10; count++) {
            System.out.println(count);
        }

        // while loop
        System.out.println("This is while loop");
        int number = 0;
        while (number < 10) {
            System.out.println(number);
            number++;
        }

        // This is do while
        System.out.println("This is do while loop");
        int n = 0;
        do {
            System.out.println(n);
            n++;
        } while (n < 10); 
    }
}
