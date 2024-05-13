import java.util.Scanner;

public class CheckUpperLower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char s=sc.next().charAt(0);

        if(Character.isUpperCase(s)==true){
            System.out.println("1");
        }else if(Character.isLowerCase(s)==true){
            System.out.println("-1");
        }else{
            System.out.println("0");
        }

        sc.close();
    }
}
