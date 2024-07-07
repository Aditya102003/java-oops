
class Student {
    String name;
    // static variables are common to all the other objects
    static String school;
}

public class Static {

    public static void main(String[] args) {

        // static mehtods and static variables are accessed by the class names

        Student.school = "City Montessorie School";
        Student s1 = new Student();
        s1.name = "Aditya";
        System.out.println(s1.school);
    }

}
