import java.util.Scanner;

public class ReverseNumber {
    public static int signedRevNum(int n) {
        String s = Integer.toString(n);
        int revNum = 0;
        // for (int i = 0; i < s.length(); i++) {
        // int lastDigit = n % 10;
        // n = n / 10;
        // revNum = revNum * 10 + lastDigit;
        // }

        // if (n < 0) {
        //     n = -1 * n;
        //     while (n > 0) {
        //         int lastDigit = n % 10;
        //         n = n / 10;
        //         revNum = revNum * 10 + lastDigit;
        //     }
        // }else{
        //     while (n > 0) {
        //         int lastDigit = n % 10;
        //         n = n / 10;
        //         revNum = revNum * 10 + lastDigit;
        //     }
        // }


        // if (n < 0) {
        //     revNum = -1*revNum;
        // }

        // return revNum;

        boolean negative=false;
        if(n<0){
            negative=true;
            n *= -1;
        }   

        long reverse=0;
        while(n>0){
            reverse=(reverse *10 )+ (n %10);
            n /=10;
        }

        return (negative)?(int) (-1 * reverse):(int)reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int revNum = 0;
        int num = sc.nextInt();
        // while (num > 0) {
        // int lastDigit = num % 10;
        // num = num / 10;
        // revNum = revNum * 10 + lastDigit;
        // }
        System.out.println(signedRevNum(num));

        sc.close();
    }
}
