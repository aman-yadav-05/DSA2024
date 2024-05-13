class overLoadEx {
    String name;
    int age;

    public void printInfo(String name) {
        this.name = name;
        System.out.println(this.name);
    }

    public void printInfo(int age) {
        this.age = age;
        System.out.println(this.age);
    }

    public void printInfo(String name, int age) {
        this.age = age;
        this.name = name;

        System.out.println(this.name + " " + this.age);
    }
}

public class FunctionOverloading {
    public static void main(String[] args) {
        overLoadEx obj = new overLoadEx();
        obj.printInfo("aman", 23);
        obj.printInfo("garima");
        obj.printInfo(23);
    }
}
