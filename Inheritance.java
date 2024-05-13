class Shape {
    int side;

    public void area() {
        System.out.println("displays area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

class EquilateralTrianle extends Triangle {
    public void perimeter(int side) {
        System.out.println(3 * side);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        EquilateralTrianle e1 = new EquilateralTrianle();
        e1.side = 3;
        e1.area(23, 34);
        e1.perimeter(8);
    }
}
