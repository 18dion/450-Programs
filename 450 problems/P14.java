import java.util.Scanner;

class P14{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first no : ");
		int n1= sc.nextInt();
		
		System.out.println("Enter second no : ");
		int n2= sc.nextInt();
		
		int gcd = findGCD(n1,n2);
		
		System.out.println("GCD of" + n1 + " and "+ n2+ " is : "+gcd);
	}
	
	static int findGCD(int n1,int n2){
		
		if(n2 ==0){
			return n1;
		}
		else {
			return findGCD(n2,n1 % n2);
		}
	}
}

