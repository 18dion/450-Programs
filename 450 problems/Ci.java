import java.util.Scanner;
import java.lang.Math;

class Ci{
public static void main(String [] args){

Scanner sc = new Scanner(System.in);
double p,r,n,t,ci;

System.out.println("Enter Principle amount : ");
p=sc.nextDouble();


System.out.println("Enter Rate of interest : ");
r=sc.nextDouble();


System.out.println("Enter time in year: ");
t=sc.nextDouble();


System.out.println("Enter time interest is compounded per year : ");
n=sc.nextDouble();

ci=p*Math.pow((1+r/n) , (n*t));
System.out.println("CI is : "+ci);
}
}