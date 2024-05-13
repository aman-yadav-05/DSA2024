import java.util.Scanner;

public class LinearSearch {

    static int search(int key, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    // checking if there is specific character in given String
    static boolean searchString(String data, char key) {
        if (data.length() == 0) {
            return false;
        }

        for (int i = 0; i < data.length(); i++) {
            if (key == data.charAt(i)) {
                return true;
            }
        }

        return false;
    }

    // searching in range in the array
    static int searchInRange(int[] arr, int firstRange, int SecondRange, int key) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = firstRange; i <= SecondRange; i++) {
            if (key == arr[i]) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 12, 34, 234, 23, 33, 748 };
        int firstRange = sc.nextInt();
        int SecondRange = sc.nextInt();
        int key = sc.nextInt();
        // String data=sc.next();
        // char key=sc.next().charAt(0);

        // System.out.println(searchString(data, key));
        // System.out.println(search(key, arr));

        System.out.println(searchInRange(arr, firstRange, SecondRange, key));
        sc.close();
    }

}
