import  java.util.Scanner;

class Circumference {
public static void main(String args []){

double radius,circum;

Scanner sc = new Scanner(System.in);
System.out.println("Enter Radius :");
radius = sc.nextDouble();

circum = 2*Math.PI*radius;

System.out.println("Circumference of circle : "+ circum);

}
}