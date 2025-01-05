package leetcode;

public class TwoSumProblem {

    public static void main(String[] args) {
        int numbers[] = {1, 5, 6, 8, 6, 9, 11};
        int target = 12;
        boolean isPairFound = false;

        // brute force approach without using HashMap
        //output
        // target is found on index: [0 , 6]
        // target is found on index: [2 , 4]
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println("target is found on index: [" + i + " , " + j + "]");
                    isPairFound = true;
                }
            }
        }

        // If no pair is found
        if (!isPairFound) {
            System.out.println("No pair found that sums to " + target);
        }

    }
}
