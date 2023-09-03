package abstractmethod1;
import  java.util.*;

public class A1 {
	public static void main(String[]args)
	{
	int b=B1.m1();
	B1.paas(b);
	
	}
}
class B1{

	
	public static int m1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enteer the user values");
		int a=sc.nextInt();
		return a;
		// TODO Auto-generated method stub

	}
	public static void  paas(int b)
	{
		int c=0;
		System.out.println("the eneterd value is"+b);
		for(int j=1;j<=b;j++) {
				int count = 0;
		for (int i =1;i<=b; i++) {
		if(j%i==0)
		{
			count++;
		}
		
	}
	
		if(count==2)
		{
			
			c++;
		}
		
	}
		System.out.println(c);
	}
}


