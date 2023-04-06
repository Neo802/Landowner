package main;

import java.util.Scanner;
import shapes.Rectangle;
import shapes.Square;
import shapes.Triangle;
import shapes.Circle;

// Developed by Neo802

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Landowner landOwner = new Landowner();

        while (true) {
            System.out.println("Enter 1 to add a new plot of land");
            System.out.println("Enter 2 to remove a plot of land");
            System.out.println("Enter 3 to calculate the area of a land");
            System.out.println("Enter 4 to display the total area of land owned by the landowner");
            System.out.println("Enter 5 to exit");

            int choice = scanner.nextInt();

            if (choice == 1) {
            	System.out.println("Shape types: 1 - Rectangle, 2 - Square, 3 - Triangle, 4 - Circle");
                System.out.print("Enter the type of shape: ");
                int shape = scanner.nextInt();
                
                if (shape == 1) { // Rectangle
                    System.out.print("Enter the length of the rectangle plot: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle plot: ");
                    double width = scanner.nextDouble();

                    Rectangle plot = new Rectangle(length, width);
                    landOwner.addPlot(plot);
                }
                else if (shape == 2) { // Square
                    System.out.print("Enter the side of the square plot: ");
                    double side = scanner.nextDouble();

                    Square plot = new Square(side);
                    landOwner.addPlot(plot);
                }
                else if (shape == 3) { // Triangle
                    System.out.print("Enter the base of the triangle plot: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the height of the triangle plot: ");
                    double height = scanner.nextDouble();

                    Triangle plot = new Triangle(base, height);
                    landOwner.addPlot(plot);
                }
                else if (shape == 4) { // Circle
                    System.out.print("Enter the radius of the circle plot: ");
                    double radius = scanner.nextDouble();

                    Circle plot = new Circle(radius);
                    landOwner.addPlot(plot);
                }
            } else if (choice == 2) {
            	System.out.println("Shape types: 1 - Rectangle, 2 - Square, 3 - Triangle, 4 - Circle");
                System.out.print("Enter the type of shape: ");
                int shape = scanner.nextInt();
                
                if (shape == 1) { // Rectangle
                    System.out.print("Enter the length of the rectangle plot: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle plot: ");
                    double width = scanner.nextDouble();

                    Rectangle plot = new Rectangle(length, width);
                    landOwner.removePlot(plot);
                }
                else if (shape == 2) { // Square
                    System.out.print("Enter the side of the square plot: ");
                    double side = scanner.nextDouble();

                    Square plot = new Square(side);
                    landOwner.removePlot(plot);
                }
                else if (shape == 3) { // Triangle
                    System.out.print("Enter the base of the triangle plot: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the height of the triangle plot: ");
                    double height = scanner.nextDouble();

                    Triangle plot = new Triangle(base, height);
                    landOwner.removePlot(plot);
                }
                else if (shape == 4) { // Circle
                    System.out.print("Enter the radius of the circle plot: ");
                    double radius = scanner.nextDouble();

                    Circle plot = new Circle(radius);
                    landOwner.removePlot(plot);
                }
                
            } else if (choice == 3) {
                System.out.print("Enter the index position of the plot: ");
                int index = scanner.nextInt();
                System.out.println("The area of the land " + index + " is " + landOwner.getArea(index));
            } else if (choice == 4) {
                System.out.println("The total area of land owned by the landowner is " + landOwner.computeTotalArea());
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

}

