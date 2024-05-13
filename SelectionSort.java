import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();

        System.out.println("before selection sort:");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        selSort(arr, size);

        sc.close();
    }

    private static void selSort(int[] arr, int n) {

        for (int i = 0; i < n - 2; i++) {
            int minimum = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[minimum])
                    minimum = j;
            }
            int temp = arr[i];
            arr[i] = arr[minimum];
            arr[minimum] = temp;
        }

        System.out.println("after selection sort:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selSort'");
    }
}
