Shape Calculator

A menu-driven Java program to calculate the Area, Perimeter, and Volume of different geometric shapes.

Table of Contents:
- Features
- Requirements
- Installation & Running
- Example Usage
- Project Structure
- Methods & Functions
- Contribution Guidelines
- License

Features:
- Supports 2D Shapes: Circle (Area, Perimeter), Rectangle (Area, Perimeter), Square (Area, Perimeter).
- Supports 3D Shapes: Sphere (Surface Area, Volume), Cylinder (Surface Area, Volume).
- Uses Abstract Class and Interface for implementation.
- Provides a Menu-driven interface for easy interaction.
- Validates user input for accurate calculations.


Example Usage:
- The program will display a menu allowing users to select a shape.
- Users enter the required dimensions, and the program calculates and displays the shape’s area, perimeter, and volume (if applicable).
- The menu will repeat until the user selects the Exit option.

Example Output:
--- Shape Calculator ---
1. Circle
2. Rectangle
3. Square
4. Sphere
5. Cylinder
6. Exit
Enter your choice: 1

Enter radius of Circle: 5
Shape: Circle
Area: 78.54
Perimeter: 31.42



Methods & Functions:
- Shape(String shape) - Constructor for Shape class.
- calculateArea() - Abstract method for area calculation.
- calculatePerimeter() - Abstract method for perimeter calculation.
- calculateVolume() - Implemented in Volume interface.
- getUserInput() - Static method to take user input for each shape.
- displayShape() - Prints shape details.



Developed by Mahi Jadeja
PRN: 23070126068
Batch: 2024
