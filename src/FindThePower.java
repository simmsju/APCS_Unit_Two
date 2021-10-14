import java.util.Scanner;

public class FindThePower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Base: ");
        int base = scan.nextInt();
        System.out.print("Enter the Exponent: ");
        int exponent = scan.nextInt();
        System.out.println(base + "^" + exponent + " = " + (int)Math.pow(base, exponent));

    }
    // create a main method below and follow the given requirements carefully.
    // Remember to create a Scanner object in order to get input from the user.
    // You will need to uncomment the FindThePower test in order to get it to run.
}
