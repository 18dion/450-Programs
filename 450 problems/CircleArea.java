import  java.util.Scanner;

class CircleArea {
public static void main(String args []){

double radius,area;

Scanner sc = new Scanner(System.in);
System.out.println("Enter Radius :");
radius = sc.nextDouble();

area = Math.PI*radius*radius;

System.out.println("Area of circle : "+ area);

}
}