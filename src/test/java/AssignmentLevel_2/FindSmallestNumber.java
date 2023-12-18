package AssignmentLevel_2;

public class FindSmallestNumber {

    //  Write a Java method to find the smallest number among three numbers.
    //Test Data:
    //Input the first number: 25
    //Input the Second number: 37
    //Input the third number: 29
    //Expected Output:
    //The smallest value is 25.0

    public static void main(String[] args) {

        int a =25;
        int b =37;
        int c =29;

        if(a<b&a<c){
             System.out.println("Smallest number is = "+a);
        } else if (b<a&b<c) {
            System.out.println("Smallest number is = " + b);
        }else if (c<a&c<b){
            System.out.println("Smallest number is = " + c);

        }


        }

    }


