package strings_in_java;

public class ReverseString {

    public static void main(String[] args) {

        String str = "DevSecPrime";
        StringBuilder sb = new StringBuilder(str);
        // reverse string
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(" " + sb.charAt(i));
        }
    }
}
