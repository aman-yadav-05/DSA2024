public class MinimumNumberInArray {
    static int minimum(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i:arr){
            if(i<=min)
                min=i;
        }
        return min;
    }
    public static void main(String[] args){

        int[] nums={1,2,3,4,-1,-3};
        System.out.println(minimum(nums));
    }
}
