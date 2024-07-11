import java.util.Scanner;

public class P37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width of the rectangle:");
        double width = scanner.nextDouble();

        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();

        double area = width * length;

        System.out.println("The area of the rectangle is: " + area);
    }
}