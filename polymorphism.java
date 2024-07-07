// function overloading is the example of compile time polymorphism 

class Student {

    String name;
    int age;

    public void print(String name) {
        System.out.println(name);
    }

    public void print(int age) {
        System.out.println(age);
    }

    public void print(String name, int age) {
        System.out.println(name + " " + age);

    }

}

public class polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aditya";
        s1.age = 22;
        s1.print(s1.name);
        s1.print(s1.age);
        s1.print(s1.name, s1.age);
    }

}
