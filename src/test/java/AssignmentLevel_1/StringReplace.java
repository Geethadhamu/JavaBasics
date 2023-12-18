package AssignmentLevel_1;

public class StringReplace {

    // Write a Java program to replace a specified character with another character
    //- Sample Output:
    //   - Original string: The quick brown fox jumps over the lazy dog.
    //   - New String: The quick brown fox jumps over the lazy fog.

    public static void main(String[] args) {
        String originalstr = "The quick brown fox jumps over the lazy dog";
        String newstr = "The quick brown fox jumps over the lazy fog";

        System.out.println(originalstr.replace( 'd','f'));
        System.out.println("original string is " +originalstr );
        System.out.println("newstring is " +newstr);
    }
}
