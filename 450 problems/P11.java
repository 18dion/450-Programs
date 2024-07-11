import java.util.Scanner;

public class P11{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the no. :");
		
		int num = sc.nextInt();
		double a = Math.pow(num,1);
		double b = Math.pow(num,2);
		double c = Math.pow(num,3);
		
		System.out.println("the first three powers are: "+a+", "+b+", "+c);
	}
}