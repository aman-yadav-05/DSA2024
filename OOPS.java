class Car {
    String name;
    String type;

    public void blowHorn() {
        System.out.println(this.name + " is blowing horn");
    }
}

public class OOPS {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "swift";
        c1.type = "sedan";

        Car c2 = new Car();
        c2.name = "kia";
        c2.type = "suv";

        c1.blowHorn();
        c2.blowHorn();
    }
}
