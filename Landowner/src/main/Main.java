package main;

import shapes.Rectangle;
import shapes.Square;
import shapes.Triangle;
import shapes.Circle;

public class Main {

    public static void main(String[] args) {
    	// To do: menu
    	// This is just a demonstration of the Landowner application
    	
        Landowner landOwner = new Landowner();

        Rectangle plot = new Rectangle(100, 200); // (A. B)
        landOwner.addPlot(plot);
        
        Square plot2 = new Square(10); // (A)
        landOwner.addPlot(plot2);
        
        Circle plot3 = new Circle(5); // (R)
        landOwner.addPlot(plot3);
        
        Triangle plot4 = new Triangle(10, 50); // (B, H)
        landOwner.addPlot(plot4);

        System.out.println("The area of the land " + 0 + " is " + landOwner.getArea(0)); // Area = A * B
        System.out.println("The area of the land " + 1 + " is " + landOwner.getArea(1)); // Area = A^2
        System.out.println("The area of the land " + 2 + " is " + landOwner.getArea(2)); // Area = Pi * R^2
        System.out.println("The area of the land " + 3 + " is " + landOwner.getArea(3)); // Area = (B * H)/2

        System.out.println("The total area of land owned by the landowner is " + landOwner.computeTotalArea());

        landOwner.removePlot(plot);
        
        System.out.println("The total area of land owned by the landowner is " + landOwner.computeTotalArea());
        
    }

}
