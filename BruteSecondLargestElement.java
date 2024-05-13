import java.util.Scanner;

public class BruteSecondLargestElement {
    static int secondLargest(int[] arr ,int n){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<=arr[i]){
                max=arr[i];
            }
        }
        int val=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>val && arr[i]!=max){
                val=arr[i];
            }
        }
        return val;
    }
    
    static int optimalSecondLargest(int[] arr, int n){
        int largest=arr[0];
        int slargest=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(largest<arr[i]){
                slargest=largest;
                largest=arr[i];
            }else if (arr[i] < largest && arr[i]>slargest) {
                slargest=arr[i];
            }
        }
        return slargest;
    }
    public static void main(String[] args) {
        int[] arr={12, 35, 1, 10, 34, 1};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(optimalSecondLargest(arr,n));
    }
}
