import java.util.Scanner;

class Si{
public static void main(String [] args ){

float p,r,t,si;
Scanner sc = new Scanner(System.in);

System.out.println("Enter Principle Amount : ");
p= sc.nextFloat();
System.out.println("Enter Rate of Interest : ");
r= sc.nextFloat();
System.out.println("Enter Duration in year : ");
t= sc.nextFloat();

si=p*r*t/100;
System.out.println("SI is :  "+si);
}
}