// You are given two numbers 'a' and 'b'.
// Compare the numbers and print the relation.
// Print “smaller”, “greater” or “equal” when ‘a’ is smaller than ‘b’, greater than ‘b’, or equal to ‘b’ respectively.

import java.util.Scanner;

public class Comparision {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a<b){
            System.out.println("smaller");
        }else if(a>b){
            System.out.println("greater");
        }else{
            System.out.println("equal");
        }


        sc.close();
    }
}
