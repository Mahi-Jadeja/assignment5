import java.util.Scanner;

public class Sphere extends Shape implements Volume {
    private double radius;

    // Constructor
    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    // Calculate Area (Surface Area)
    @Override
    public double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    // No perimeter for a sphere
    @Override
    public double calculatePerimeter() {
        return 0;
    }

    // Calculate Volume
    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Get user input and create Sphere object
    public static Sphere getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of Sphere: ");
        double radius = scanner.nextDouble();
        return new Sphere(radius);
    }
}
