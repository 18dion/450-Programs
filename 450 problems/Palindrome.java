import java.util.Scanner;

public class Palindrome{
public static void main(String [] args){
int rem,rev = 0,temp,n;

Scanner sc = new Scanner(System.in);
System.out.println("Enter No. :");
n= sc.nextInt();

temp = n;

while (n!=0){
rem=n%10;
rev = n*10+rem;
n=n/10;
}

if(temp == rev)
System.out.println(temp+" is a palindrome.");
else
System.out.println(temp+" is not a palindrome.");
}
}