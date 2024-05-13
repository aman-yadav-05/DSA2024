
public class usingSwitch {
    public static void main(String[] args) {
        int ch = 1;
        double[] a = { 4, 5 };
        System.out.println(area(ch, a));
    }

    public static double area(int ch, double[] a) {
        double value = 0;
        switch (ch) {
            case 1:
                value = Math.PI * a[0] * a[0];
                break;
            case 2:
                value = a[0] * a[1];
                break;
            default:
                break;
        }
        return value;
    }
}
