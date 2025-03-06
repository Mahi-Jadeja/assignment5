public abstract class Shape {
    protected String shapeName;

    // Constructor
    public Shape(String shape) {
        this.shapeName = shape;
    }

    // Abstract methods for area and perimeter
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    // Method to display shape name
    public void displayShape() {
        System.out.println("\nShape: " + shapeName);
    }
}
