
// abstraction in  java in implemented by the abstract keyword and the interfaces in java

// it is neccessary for all  child classs to implement the methods of functions of its parent class 

abstract class Animal {
    abstract void walk();

}

class Horse extends Animal {
    public void walk() {
        System.out.println("walks on 4 legs");

    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("walks on 4 legs");
    }

}

public class Abstract {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();

    }
}
