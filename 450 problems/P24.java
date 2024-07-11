import java.util.Scanner;

public class P24{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        int basicSalary = scanner.nextInt();

        System.out.print("Enter grade (A, B, C): ");
        String grade = scanner.next();

        int hra, da, allow, pf;
        double grossSalary;

        if (grade.equals("A")) {
            allow = 1700;
        } else if (grade.equals("B")) {
            allow = 1500;
        } else {
            allow = 1300;
        }

        hra = (int) (basicSalary * 0.20);
        da = (int) (basicSalary * 0.50);
        pf = (int) (basicSalary * 0.11);

        grossSalary = basicSalary + hra + da + allow - pf;

        System.out.println("Gross Salary: " + grossSalary);
    }
}