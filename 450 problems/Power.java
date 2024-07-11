import java.util.Scanner;

class Power{
public static void main(String [] args){

Scanner sc= new Scanner (System.in);

System.out.println("Enter the base value:");
int base = sc.nextInt();

System.out.println("Enter the Exponent value:");
int exp = sc.nextInt();

long result =1;

System.out.println(base+"raised to the power of "+exp+ " is: ");

while (exp !=0){
result *= base;
--exp;
}
System.out.println(result);
}
}