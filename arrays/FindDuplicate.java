package arrays;

public class FindDuplicate {
    public static void main(String args[]) {
        int numbers[] = { 1, 5, 6, 7, 5, 2, 2, 6 };
        int result[] = {};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[j]);
                }
            }
        }
    }
}
