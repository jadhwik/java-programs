package Abstraction;

abstract class Shape {
    public abstract int calcArea();
}

// class for extending chape
class Circle extends Shape {
    private int r;

    // constrctor to take input radius

    public Circle(int r) {
        this.r = r;
    }

    public int calcArea() {

        double PI = 3.14;
        return (int) PI * r * r;
    }
}

// class for extending shape

class Rectangle extends Shape {
    private int l;
    private int b;

    public Rectangle(int l, int b) {
        this.b = b;
        this.l = l;
    }

    public int calcArea() {

        return 2 * (l + b);

    }
}

public class Abstraction {
    public static void main(String[] args) {

        Shape obj = new Circle(3);
        System.out.println(obj.calcArea());

        Shape obj1 = new Rectangle(10, 10);

        System.out.println(obj1.calcArea());

    }

}
