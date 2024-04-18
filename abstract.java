abstract class Shape {
    // Abstract method (does not have a body)
    public abstract double area();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

}

    public class abstract{

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 4);
        System.out.println("Area of rectangle: " + rectangle.area());

        Shape circle = new Circle(3);
        System.out.println("Area of circle: " + circle.area());
    }
}
