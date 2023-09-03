package bank;

import java.util.Scanner;

public class mainclass {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("===================");
		System.out.println("enter the pin");
		bank a1=new bank();
		int pin1=sc.nextInt();
		if(a1.pin==pin1)
		{
	
		int i=0;
		while(i<1000)
		{
			System.out.println("1.deposite \n 2. withdrawel \n  3.pin ");
			
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1: a1.deposite();
				i++;
				break;
		case 2: a1.withdrawel();
				i++;
				break;
		case 3: a1.pin();
				i++;
				break;
		default : System.out.println("your choice is not available");
		}
		}
		}
		
		else
		{
			System.out.println("enterd pin is wrong");
		}
	}
}
