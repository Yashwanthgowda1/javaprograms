package exception;

import java.util.Scanner;

public class class10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the given number");
		int a=sc.nextInt();
		int temp=a;
		try {
			System.out.println("try starts");
			int sum=0;
			while(a>0)
			{
				int rem=0;
				rem=a%10;
				sum=(sum*10)+rem;
				a=a/10;
			}
			if(sum==temp)
			{
				System.out.println("it is palidrome");
			}
			else
			{
				System.out.println("not a palidrome");
			}
			
		}
		catch(Exception e) {
			System.out.println("catch starts");
			System.out.println(e.getMessage());
			System.out.println("catch ends");
		}
	}

}
