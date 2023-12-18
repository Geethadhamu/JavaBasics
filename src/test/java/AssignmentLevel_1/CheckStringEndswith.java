package AssignmentLevel_1;

public class CheckStringEndswith {
    // Write a Java program to check whether a given string ends with the contents of another string
    //Sample Output:
    //"Python Exercises" ends with "se"? false
    //"Python Exercise" ends with "se"? true
    //
     public static void main(String[] args) {
        String str1 = "Python Exercises";
        String str2 = "Python Exercise";

        System.out.println("String " + str1 +" is " + str1.endsWith("se") );
        System.out.println("String " + str1 +" is " + str2.endsWith("se") );

}
}

