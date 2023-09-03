package abstractmethod1;
import  java.util.*;
public class A {
	public static void main(String[]args)
	{
	int b=B.m1();
	B.paas(b);
	
	}
}
class B
{
	
	public static int m1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enteer the user values");
		int a=sc.nextInt();
		return a;
		// TODO Auto-generated method stub

	}
	public static void  paas(int b)
	{
		System.out.println("the eneterd value is"+b);
		int count=0;
		for (int i =1;i<=b; i++) {
		if(b%i==0)
		{
			count++;
		}
		
	}
		if(count==2)
		{
			System.out.println("it is prime number");
		}
		else if(count>2)
		{
			System.out.println("it is a composite number");
		}
		else
		{
			System.out.println("it is prime nor composite");
		}
	}
}

