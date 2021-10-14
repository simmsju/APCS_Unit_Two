import java.util.Locale;
import java.util.Scanner;

public class EmailGenerator {
    public static String makeUserName(String name) {
        int randomNum = (int)(Math.random() * 90) + 10;
        String username = name.substring(0, 1).toLowerCase() + name.substring(name.indexOf(" ") + 1).toLowerCase() + randomNum;
        return username;
    }

    public static String makeEmail(String username, String emailProvider) {
        String email = username + "@" + emailProvider;
        return email;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First and Last Name: ");
        String name = scan.nextLine();
        System.out.print("Enter Email Provider (E.g. gmail.com): ");
        String emailProvider = scan.nextLine();
        System.out.println("Your new generated email is: " + makeEmail(makeUserName(name), emailProvider.toLowerCase()));
    }
}
