package AssignmentLevel_1;

public class StringConcatenate {
    // Write a Java program to concatenate a given string to the end of another string
    //Sample Output:
    //String 1: PHP Exercises and
    //String 2: Python Exercises
    //The concatenated string: PHP Exercises and Python Exercises

    public static void main(String[] args) {

        String str1 = "PHP Exercises and ";
        String str2 = "Python Exercises";
        String str3 = str1.concat(str2);

        System.out.println("String Number1 ="+ str1);
        System.out.println("String Number2 ="+ str2);

        System.out.println("Concatenated Strings ="+ str3);


    }

}
