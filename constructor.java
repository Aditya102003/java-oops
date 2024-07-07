
class Student {
    String name;
    int age;

    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // non paramterized constructor

    // construtor gets called the moment an object is created as this is also a
    // funciton having no return type and having same name as class name

    Student() {
        System.out.println("constrctor called");
    }

}

public class constructor {

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Aditya";
        s1.age = 22;
        s1.print();

    }
}
