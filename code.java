class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("writing something");

    }

    public void print() {
        System.out.println(this.color);
        System.out.println(this.type);
    }

}

public class code {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "black";
        p1.type = "gel";
        // p1.write();
        p1.print();
        Pen p2 = new Pen();
        p2.color = "blue";
        p2.type = "ball";
        p2.print();
    }
}