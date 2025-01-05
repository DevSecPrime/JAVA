package bitManipulation;

public class BitManipulationPractice {
    public static void main(String args[]) {
        // Get the from 3rd (position = 2) from the number n; n = 0101
        // Bit Mask: leftShift 1<<i ==> 1010
        // Operation AND

        // Note: Manipulating any bit or performing operation with bit can considered as
        // BitMask\

        // 1] 1<<2 ==> 0001<<2 ==> 0100
        // 2] 0100 AND n ===> 0100 AND 0101 ==> 0100

        // if number is non-zero --> it`s bit is 1
        // if number is zero ------> it`s bit is 0

        // Get bit
        //ans: bit was 1
        int n = 5;// 0101
        int position = 2;
        int bitMask = 1 << position;

        if ((bitMask & n) == 0) {
            System.out.println("BIT WAS 0");
        } else {
            System.out.println("BIT WAS 1");
        }

    }
}
