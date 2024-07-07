// interfaces are used to implement pure abstraction and it is also used to implement the multiple inheritance 

// all the fields in the interface are public, static and final by default

// all the methods are public and abstract by default 

interface Animal {
    // interface dont have constructor and they do not have
    // concrete methods;

    // they only have the abstract methods

    // no abstract methods in the interface
    public void walk();
}

interface Herbivore {
    void plants();

}

// the concept of the multiple inheritance
class Horse
        implements Animal, Herbivore {
    public void walk() {
        System.out.println("walks on 4 legs");
    }

    public void plants() {
        System.out.println("eats ony plants");
    }
}

public class Interface {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.plants();
    }
}
