package AssignmentLevel_1;

public class StringComparing {

    // Write a Java program to test if a given string contains the specified sequence of char values
    //Sample Output:
    //Comparing example.com and example.com: true
    //Comparing Example.com and example.com: false
    public static void main(String[] args) {

        String str1 = "example.com";
        String str2 = "example.com";
        boolean str3 = str1.equals(str2);

        String str4 = "Example.com";
        boolean str5 = str1.equals(str4);

        System.out.println("String Number1 ="+ str1);
        System.out.println("String Number2 ="+ str2);
        System.out.println("String Number3 ="+ str4);
        System.out.println("comparing values of str1&str2 ="+ str3);
        System.out.println("comparing values of str1&str4="+ str5);


    }

}
