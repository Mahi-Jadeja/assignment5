import java.util.Scanner;

public class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    // Calculate Area
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Calculate Perimeter (Circumference)
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    // Get user input and create Circle object
    public static Circle getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of Circle: ");
        double radius = scanner.nextDouble();
        return new Circle(radius);
    }
}
