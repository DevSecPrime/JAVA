package bitManipulation;

public class SetBit {
    public static void main(String args[]) {
        // Get the from 2nd (position = 1) from the number n; n = 0101
        // Bit Mask: leftShift 1<<i ==> i is position here 2nd position --> 2nd index
        // --> 1
        // Operation OR

        // Note: Manipulating any bit or performing operation with bit can considered as
        // BitMask\

        // 1] 1<<1 ==> 0001<< ==> 0010
        // 2] 0010 OR n ===> 0010 OR 0101 ==> 0111 -> 7 base 10

        // if number is non-zero --> it`s bit is 1
        // if number is zero ------> it`s bit is 0

        // Get bit
        // ans: bit was 1
        int n = 5;// 0101
        int position = 1;
        int bitMask = 1 << position;

        int newNumber = bitMask | n;// ans will be 7
        System.out.print("New number is: " + newNumber); // New number is: 7
    }
}
