import java.util.Scanner;

public class Square extends Shape {
    private double side;

    // Constructor
    public Square(double side) {
        super("Square");
        this.side = side;
    }

    // Calculate Area
    @Override
    public double calculateArea() {
        return side * side;
    }

    // Calculate Perimeter
    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    // Get user input and create Square object
    public static Square getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side of Square: ");
        double side = scanner.nextDouble();
        return new Square(side);
    }
}
