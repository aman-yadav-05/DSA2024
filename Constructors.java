
class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // parameterized Constructors
    Student(String name1, int age1) {
        this.name = name1;
        this.age = age1;
    }

    // non parameterised Constructor
    Student() {
        System.out.println("non-parameterised constructor is called");
    }

    // copy constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student("aman", 22);
        Student s2 = new Student(s1);
        s2.printInfo();

        Student s3 = new Student();
        s3.age = 23;
        s3.name = "garima";
        s3.printInfo();
    }
}
