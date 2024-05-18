public class IsSorted {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 5, 2, 2, 3, 3, 4 };
        System.out.println(isSorted(arr));
    }

    private static boolean isSorted(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] < arr[i])
                return false;
        }
        return true;
    }
}
