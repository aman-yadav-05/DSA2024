public class RecusrsionBasics {
    static void recFunc() {
        System.out.print("1");
        recFunc();
    }

    // recursive function with base condition
    public static int counter = 0;

    static void baseRecFunc() {
        if (counter==3) return;
        System.out.println(counter);
        counter++;
        baseRecFunc();
    }


    //print name 5 times
    public static void printName(String name){
        if(counter==5) return;
        System.out.println(name);
        counter++;
        printName(name);
    }

    //print linearly from 1 to n 
    public static int count=1;
    public static void LinearCount(int n){
        if(count==n+1) return;
        System.out.println(count);
        count++;
        LinearCount(n);
    }

    //print linear count from n to 1
    public static void LinearCountReverse(int n){
        if(n==0) return;
        System.out.println(n);
        n--;
        LinearCountReverse(n);
    }

    //some of first n numbers
    public static int SumOfN(int n){
        if(n==0){
            return 0;
        }
        return n+SumOfN(n-1);
    }

    //factorial of a number
    public static int Factorial(int n){
        if(n==1) return 1;
        return n*Factorial(n-1);
    }
    public static void main(String[] args) {
        // recFunc();
        // baseRecFunc();
        // printName("aman");
        // LinearCount(10);
        // LinearCountReverse(10);
        // System.out.println(SumOfN(5));
        System.out.println(Factorial(5));
    }
}
