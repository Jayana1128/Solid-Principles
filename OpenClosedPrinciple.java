
// Open-Closed Principle
abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double area() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    double side;
    Square(double side) {
        this.side = side;
    }
    double area() {
        return side * side;
    }
}

class AreaCalculator {
    public void printArea(Shape shape) {
        System.out.println("Area: " + shape.area());
    }
}

public class OpenClosedPrinciple {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        calculator.printArea(new Circle(5));
        calculator.printArea(new Square(4));
    }
}
