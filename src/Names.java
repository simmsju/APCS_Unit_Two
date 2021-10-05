import java.util.Locale;
import java.util.Scanner;

public class Names {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get the first and last names as separate variables (use the Scanner object to get the input)
        System.out.print("First Name:");
        String fName = scan.nextLine();
        System.out.print("Last Name:");
        String lName = scan.nextLine();
        System.out.println(fName + " " + lName);
        System.out.println(fName.length() + lName.length());
        System.out.println(fName.substring(0,1) + lName.substring(0,1));
        System.out.println(fName.compareTo(lName));
        System.out.println(lName.indexOf(fName.substring(0,1).toLowerCase(Locale.ROOT)));
        System.out.println(fName.indexOf(lName.substring(lName.length() - 1)));
        System.out.println((fName.substring(0, fName.length()/2) + lName.substring(lName.length()/2) + " " + (lName.substring(0, lName.length()/2)) + fName.substring(fName.length()/2)));
        // Use the required string methods to print out the information


    }
}
