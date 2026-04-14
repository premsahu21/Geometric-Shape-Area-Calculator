interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Square implements Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Square(4);

        System.out.println("Area of Circle: " + s1.calculateArea());
        System.out.println("Area of Square: " + s2.calculateArea());
    }
}