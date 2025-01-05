package bitManipulation;

public class ClearBit {
    public static void main(String args[]) {
        // Get the from 3nd (position = 2) from the number n; n = 0101
        // BitMask 1<<i ==> here, i position 1 leftShift 2nd position means 2nd index
        // from 0101 L --> R ==> 2 ---> 0100

        // AND with NOT --> first perform negation (NOT) then perform AND operation with
        // negated bitmask

        // Note: Manipulating any bit or performing operation with bit can considered as
        // BitMask\

        // 1] 1<<2 ==> 0001<<2 ==> 0100
        // 2] ~(0100) ==> 1011
        // 3] 1011 & 0101 --> 0001

        int n = 5;// 0101
        int position = 2;
        int bitMask = 1 << position;
        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & n;
        System.out.print("clear bit :" + newNumber);// clear bit :1
    }
}
