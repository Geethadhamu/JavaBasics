package AssignmentLevel_2;

import java.util.ArrayList;
import java.util.List;

public class VowelsCount {
    // Write a Java method to count all vowels in a string.
    //Test Data:
    //Input the string: w3resource
    //Expected Output:
    //Number of Vowels in the string: 4

    public static void main(String[] args) {

        int count = 0;
        String str = "w3resource";

        Object collection;
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<=str.length();){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){

                count++;

            }
        }

    }
}
