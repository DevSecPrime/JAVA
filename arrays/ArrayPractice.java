package arrays;

public class ArrayPractice {
    public static void main(String args[]) {
        // Array semtex
        // type[] arrayName = new type[];
        // type arrayName[] = new type[];

        int marks[] = new int[3];

        marks[0] = 97;// phy
        marks[1] = 90;// maths
        marks[2] = 92;// chemistry

        for (int i = 0; i < marks.length; i++) {

            System.out.println(marks[i]);
        }

    }
}
