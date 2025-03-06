import java.util.Scanner;

public class Rectangle extends Shape {
    private double length, width;

    // Constructor
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    // Calculate Area
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Calculate Perimeter
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Get user input and create Rectangle object
    public static Rectangle getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of Rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of Rectangle: ");
        double width = scanner.nextDouble();
        return new Rectangle(length, width);
    }
}
