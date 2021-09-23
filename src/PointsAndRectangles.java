import java.awt.Rectangle;
import java.awt.Point;
import java.awt.Dimension;
import java.util.Scanner;

public class PointsAndRectangles
{

    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        // create print statements and get input for the x and y values.
        System.out.print("Enter the x coordinate: ");
        int x = kb.nextInt();
        System.out.print("Enter the y coordinate: ");
        int y = kb.nextInt();
        System.out.print("Enter the width: ");
        int width = kb.nextInt();
        System.out.print("Enter the height: ");
        int height = kb.nextInt();
        //Instantiate a Point object p. Hint: you will need the keyword "new"
        Point p1 = new Point(x, y);
        Dimension d1 = new Dimension(width, height);
        Rectangle r1 = new Rectangle(p1, d1);
        System.out.println(p1);
        System.out.println(d1);
        System.out.println(r1);

        // create print statements and get input for the length and width

        //Instantiate a Dimension object d.

        //Instantiate a Rectangle object r.

        // Print each object p, d, and r on a separate line.
    }
}