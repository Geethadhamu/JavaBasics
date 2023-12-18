package AssignmentLevel_1;

public class StringBuffer {
    public static void main(String[] args) {

        String str1 = "example.com";
        String str2 = "example.com";
        boolean str3 = str1.contentEquals(str2);

        String str4 = "Example.com";
        boolean str5 = str1.contentEquals(str4);

        System.out.println("String Number1 ="+ str1);
        System.out.println("String Number2 ="+ str2);
        System.out.println("String Number3 ="+ str4);
        System.out.println("comparing values of str1&str2 ="+ str3);
        System.out.println("comparing values of str1&str3="+ str5);

    }
}
