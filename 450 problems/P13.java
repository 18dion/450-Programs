import java.util.Scanner;

class P13{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first no : ");
		int n1= sc.nextInt();
		
		System.out.println("Enter second no : ");
		int n2= sc.nextInt();
		
		int lcm = findLCM(n1,n2);
		
		System.out.println("LCM of " + n1 + "and"+ n2+ " is : "+lcm);
	}
	
	static int findLCM(int n1,int n2){
		
		int lcm = Math.max(n1,n2);
		
		while (true){
			if (lcm % n1 == 0 && lcm % n2 == 0){
				return lcm;
			}
			lcm++;
		}
	}
}

