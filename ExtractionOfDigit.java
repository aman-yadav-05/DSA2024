import java.util.Scanner;

public class ExtractionOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // System.out.println(num / 10);
        // System.out.println(num % 10);
        int counter=0;
        while (num > 0) {
            System.out.println(num % 10);
            num = num / 10;
            counter++;
        }

        // in the same manner we can count the number of digit in any digit
        // int counter = 0;
        // while (num > 0) {
        //     num = num / 10;
        //     counter++;
        // }

        System.out.println("number of digits in given digi: " + counter);
        sc.close();
    }
}