package Com.cruiser;


import Com.cruiser.shapes.Circle;
import Com.cruiser.shapes.Rectangle;
import Com.cruiser.shapes.Shape;
import Com.cruiser.shapes.Square;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Select a shape: \nC - circle\nS - Square\nR - Rectangle");

        System.out.print("Choice: ");
        String choice = scanner.nextLine().toUpperCase();
        Shape shape = switch (choice){
            case "C" -> new Circle(getInput("radius"));
            case "R" -> new Rectangle(getInput("length"), getInput("width"));
            case "S" -> new Square(getInput("side length"));
            default -> null;
        };

        if(shape == null){
            System.out.println("Invalid input");
        }else{
            printOutput(shape);
        }


    }

    // Used to take an input by handling the possible user errors
    public static double getInput(String parameter){

        double input = -1;
        boolean finished = false;
        do{
            try{
                System.out.printf("Enter %s: ", parameter);
                input = scanner.nextDouble();
                System.out.println(); //To bring the cursor to the next line
                if (input > 0){
                    finished = true;
                } else {
                    System.out.println("Please enter a non negative number");
                }
            } catch(InputMismatchException e){
                System.out.println("Please enter a double value");
            }

        }while(!finished);

        return input;
    }

    //Prints the program output in a formatted manner
    public static void printOutput(Shape shape){
        System.out.printf(
                "%s%n%nPerimeter: %s%nArea: %s",
                shape,
                shape.getPerimeter(),
                shape.getArea()
        );
    }
}
