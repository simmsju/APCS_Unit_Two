import java.util.Scanner;

public class Distance {
    public static double distance(int x1, int y1, int x2, int y2) {
        double distance  = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        return distance;
    }
    // create the distance method below. See the instructions for the signature of the method.
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        //Enter the x coordinate of the first point: 2
        //Enter the y coordinate of the first point: -3
        //Enter the x coordinate of the second point: -4
        //Enter the y coordinate of the second point: 1
        System.out.print("Enter the x coordinate of the first point: ");
        int x1 = scan.nextInt();
        System.out.print("Enter the y coordinate of the first point: ");
        int y1 = scan.nextInt();
        System.out.print("Enter the x coordinate of the second point: ");
        int x2 = scan.nextInt();
        System.out.print("Enter the y coordinate of the second point: ");
        int y2 = scan.nextInt();
        System.out.print("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + distance(x1, y1, x2, y2));
    }

    // Create your main method below. It will get the input (you will need a Scanner), call the distance
    // method, and then print the results.
}
