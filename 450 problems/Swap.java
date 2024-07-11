class Swap{
public static void main(String [] args){

//with third variable

int a =1, b=2, temp;
System.out.println("before - a="+a+"  b="+b);
temp=a;
a=b;
b=temp;

System.out.println("after - a="+a+"  b="+b);

//without third variable

int c=4;
int d=5;

System.out.println("before - c="+c+"  d="+d);

c=c+d;
d=c-d;
c=c-d;

System.out.println("after - c="+c+"  d="+d);
}
}