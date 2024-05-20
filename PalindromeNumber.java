import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        // String s = Integer.toString(getNum);

        // String check = "";

        // for (int i = s.length() - 1; i >= 0; i--) {
        // check = check + s.charAt(i);
        // }
        // if (check.equals(s)) {
        // return true;
        // }
        // return false;

        int palNum = 0;
        int getNum = x;
        while (getNum > 0) {
            palNum = (palNum * 10) + (getNum % 10);
            getNum = getNum / 10;
        }
        if (palNum == x)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(isPalindrome(num));
        sc.close();
    }
}
