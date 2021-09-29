import java.awt.*;
import java.util.Scanner;

public class RectangleFun {

    public static void main(String[] args) {
        // Create a scanner object to be able to get input from the user
        Scanner scan = new Scanner(System.in);

        // Get input for x, y, width, and height. Create four separate variables for these.
        System.out.print("X: ");
        int x = scan.nextInt();
        System.out.print("Y: ");
        int y = scan.nextInt();
        System.out.print("Width: ");
        int width = scan.nextInt();
        System.out.print("Height: ");
        int height = scan.nextInt();

        // Create a Rectangle object using the four pieces of user input.
        Rectangle r = new Rectangle(x, y, width, height);
        double perimeter = (r.getWidth()+r.getHeight())*2;
        r.setLocation(x-4, y-2);
        // Use the appropriate methods (getWidth() and getHeight() ) to calculate the perimeter, then print it
        System.out.println("Perimeter = " + perimeter);
        System.out.println("New location is (" + r.getX() + ", " + r.getY() + ")");
        // Use getX(), getY(), and setLocation() to move the Rectangle. Print the new location.

    }
}
