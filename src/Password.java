import java.util.Locale;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("First Name:");
        String fName = scan.nextLine();
        System.out.print("Middle Name:");
        String mName = scan.nextLine();
        System.out.print("Last Name:");
        String lName = scan.nextLine();
        System.out.print("Age:");
        int age = scan.nextInt();
        System.out.print(fName.substring(fName.length() / 2, fName.length() / 2 + 1).toUpperCase());
        System.out.print(mName.substring(mName.length() / 2, mName.length() / 2 + 1).toUpperCase());
        System.out.print(lName.substring(lName.length() / 2, lName.length() / 2 + 1).toUpperCase());
        System.out.print(fName.substring(fName.length() - 1).toLowerCase());
        System.out.print(mName.substring(mName.length() - 1).toLowerCase());
        System.out.print(lName.substring(lName.length() - 1).toLowerCase());
        System.out.print(age * 75);
    }
}