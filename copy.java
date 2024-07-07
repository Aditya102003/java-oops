class Student {
    String name;
    int age;

    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // COPY CONSTRUCTOR

    // as for s1 there is no default constructor now so there should be a
    // constructor for s1 as well

    Student() {

    }

    Student(Student s1) {
        this.name = s1.name;
        this.age = s1.age;
    }

}

public class copy {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aditya";
        s1.age = 22;

        Student s2 = new Student(s1);
        s2.print();

    }
}