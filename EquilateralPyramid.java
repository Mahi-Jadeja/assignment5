

import java.util.Scanner;

public class EquilateralPyramid extends Shape implements Volume {
    private double baseSide;
    private double height;

    // Constructor
    public EquilateralPyramid(double baseSide, double height) {
        super("Equilateral Pyramid");
        this.baseSide = baseSide;
        this.height = height;
    }

    // Calculate Area (Surface Area = Base Area + 4 * Triangle Face Area)
    @Override
    public double calculateArea() {
        double baseArea = baseSide * baseSide;
        double slantHeight = Math.sqrt((baseSide / 2) * (baseSide / 2) + height * height);
        double lateralFaceArea = 4 * (0.5 * baseSide * slantHeight);
        return baseArea + lateralFaceArea;
    }

    // Calculate Perimeter (Perimeter of Base)
    @Override
    public double calculatePerimeter() {
        return 4 * baseSide;
    }

    // Calculate Volume (Volume = (1/3) * Base Area * Height)
    @Override
    public double calculateVolume() {
        return (1.0 / 3.0) * (baseSide * baseSide) * height;
    }

    // Get user input and create EquilateralPyramid object
    public static EquilateralPyramid getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base side length of Equilateral Pyramid: ");
        double baseSide = scanner.nextDouble();
        System.out.print("Enter height of Equilateral Pyramid: ");
        double height = scanner.nextDouble();
        return new EquilateralPyramid(baseSide, height);
    }
}
