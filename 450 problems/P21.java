import java.util.Scanner;

public class P21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base width of the Triangle:");
        double base = scanner.nextDouble();

        System.out.println("Enter the height of the Triangle:");
        double height = scanner.nextDouble();

        double area = (base * height) / 2;

        System.out.println("The Area of the Triangle is: " + area);
    }
}