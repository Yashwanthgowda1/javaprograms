package section3exceptionhandeling;

import java.util.Scanner;

public class specialnumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("main starts");
	System.out.println("enter the a value");
	int a=sc.nextInt();
	int temp=a;
	int sum=0;
	
		while(a>0)
		{
			int rem=0;
			rem=a%10;
			int fac=1;
			for(int i=1;i<=rem;i++) {
				fac=fac*i;
				
			}
			sum=sum+fac;
			a=a/10;
		}
		System.out.println(sum);
	if(a==temp) {
		System.out.println("it is a special number");
	}
	else
	{
		try
		{
			throw new Exception();
		}
		
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
}
}

