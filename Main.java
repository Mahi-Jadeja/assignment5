// Name: Mahi Jadeja
// PRN: 23070126068
// Batch: 2025


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Shape Calculator ---");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            Shape shape = null;
            if (choice == 1) shape = Circle.getUserInput();
            else if (choice == 2) shape = Rectangle.getUserInput();
            else if (choice == 3) shape = Square.getUserInput();
            else if (choice == 4) shape = Sphere.getUserInput();
            else if (choice == 5) shape = Cylinder.getUserInput();

            if (shape != null) {
                shape.displayShape();
                System.out.println("Area: " + shape.calculateArea());
                System.out.println("Perimeter: " + shape.calculatePerimeter());

                if (shape instanceof Volume) {
                    System.out.println("Volume: " + ((Volume) shape).calculateVolume());
                }
            }
        } while (choice != 6);
    }
}
