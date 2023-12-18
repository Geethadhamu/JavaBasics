package AssignmentLevel_1;

public class StringCharAt {

    public static void main(String[] args) {
        //Write a Java program to get the character at the given index within the String- Sample Output:
        //Sample Output:
        //Original String = Java Exercises!
        //The character at position 0 is J
        //The character at position 10 is i

        String str = "Java Exercises!";
        System.out.println("Given String : " + str);
        char a = str.charAt(0);
        char b = str.charAt(5);
        int c = str.length();
        System.out.println("The Character at Position 0 is " +(char)a);
        System.out.println("The Character at Position 5 is " +(char)b);
        System.out.println("String length is ="+c);
    }
    }


