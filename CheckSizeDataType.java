//checking the size of datatype as getting input
//incomplete

import java.util.Scanner;

public class CheckSizeDataType {
    public static void main(String[] args) {
        // System.out.println(Integer.SIZE/8); //dividing by 8 gives us size in byte else it will be in bits.

        Scanner sc=new Scanner(System.in);

        String data=sc.next();
        data.toUpperCase();

        // System.out.println(data.SIZE/8);
        sc.close();
    }
}
