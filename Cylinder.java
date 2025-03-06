

import java.util.Scanner;

public class Cylinder extends Shape implements Volume {
    private double radius, height;

    // Constructor
    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    // Calculate Area
    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // No perimeter for a cylinder
    @Override
    public double calculatePerimeter() {
        return 0;
    }

    // Calculate Volume
    @Override
    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }

    // Get user input and create Cylinder object
    public static Cylinder getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of Cylinder: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter height of Cylinder: ");
        double height = scanner.nextDouble();
        return new Cylinder(radius, height);
    }
}
