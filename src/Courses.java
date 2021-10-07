import java.util.Scanner;

public class Courses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the description of the course? ");
        String course = scan.nextLine();

        String d = course.substring(0, course.indexOf(" "));
        String c = course.substring(course.indexOf(" "), course.indexOf(" ", course.indexOf(" ") + 1));
        String t = course.substring(course.indexOf(" ", course.indexOf(" ") + 1));
        System.out.println("Department: " + d);
        System.out.println("Course Number:" + c);
        System.out.println("Title:" + t);
        //CS 101 Introduction to Programming
    }
}
