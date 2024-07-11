import java.util.Scanner;

public class P22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName = scanner.nextLine();
        String[] names = fullName.split(" ");
        String abbreviatedName = names[0].substring(0, 1) + "." + names[names.length - 1].substring(0, 1);
        System.out.println("Abbreviated name: " + abbreviatedName);
    }
}