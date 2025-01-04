package strings_in_java;

public class StringBuilderPractice {

    public static void main(String[] args) {

        // Prime
        // Character at index 2 : i
        // Setting character at index 0 to T : Trime
        // Inserting DevSec at index 0 : DevSecPrime
        // Appending is here! : DevSecPrime is here!
        // Length of the string : 20
        // Deleting characters from index 7 : DevSecPrime
        // Inserting This is at index 0 : This is DevSecPrime
        // After replacing MrPrime at index 0 to 10 : This is MrPrime 
        // Reversed string :  emirPrM si sihT
        //initialize string builder
        String name = "Prime";
        StringBuilder sb = new StringBuilder(name);

        System.out.println(sb);

        //find character from the index
        System.out.println("Character at index 2 : " + sb.charAt(2)); //prints: i

        //set character at index
        // System.out.print("Setting character at index 0 to T : " + sb.setCharAt(0, 'T'));//prints 'Trime'
        sb.setCharAt(0, 'T');
        System.out.println("Setting character at index 0 to T : " + sb);

        //insert character at index
        sb.setCharAt(0, 'P');
        sb.insert(0, "DevSec");
        System.out.println("Inserting DevSec at index 0 : " + sb);

        //append string
        sb.append(" is here!");
        System.out.println("Appending is here! : " + sb);

        //length
        sb.length();
        System.out.println("Length of the string : " + sb.length());

        //delete character from index
        sb.delete(11, sb.length());
        System.out.println("Deleting characters from index 7 : " + sb);

        //insert the character in string
        sb.insert(0, "This is ");
        System.out.println("Inserting This is at index 0 : " + sb);//print "This is DevSecPrime"

        //replace character
        sb.replace(8, sb.length(), "MrPrime ");
        System.out.println("After replacing MrPrime at index 0 to 10 : " + sb);
        //reverse string
        sb.reverse();
        System.out.println("Reversed string : " + sb);

    }
}
