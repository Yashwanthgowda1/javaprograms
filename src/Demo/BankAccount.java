package Demo;

import java.util.Scanner;

abstract class BankAccount
{
	abstract public void Check_balance();
	abstract public void Deposit();
	abstract public void withdraw();
	abstract public void pinchange();
}

class Bank extends BankAccount
{
	Scanner scan = new Scanner(System.in);
	
	int amount;
	int pin=9632;
	
	@Override
	public void Check_balance() 
	{
		System.out.println("Check the bank balance");
		System.out.println("==============================");
		amount = 1000;
		System.out.println("Your bank having "+amount+" rs");
		System.out.println("=========================");
		
		
	}

	@Override
	public void Deposit() 
	{
		System.out.println(" deposit");
		System.out.println("=====================");
		System.out.println("enter the deposit amount");
		
		int deposit =scan.nextInt();
		System.out.println("your updated balance is "+deposit);
		
		amount=amount+deposit;
		System.out.println("==================");
		System.out.println("update the amount "+amount+"");
		System.out.println("====================");
		
		
	}

	@Override
	public void withdraw() 
	{
		System.out.println("enter the amount to withdraw");
		int withdraw=scan.nextInt();
		amount=amount-withdraw;
		System.out.println("your updated balance is "+amount);
		
	}

	@Override
	public void pinchange() 
	{	
		System.out.println("enter the pin you want to change");
		pin=scan.nextInt();
		System.out.println("your pin changed");
		
	}
}
	class MainBAnk
	{
		public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Bank b1 = new Bank();
		System.out.println("enter the pin for withdrawn");
		int pin1=sc.nextInt();
		
		if(b1.pin==pin1) 
		{
			
		int num=1;
		while(num<=4)
		{
		System.out.println("enter the choice \n 1:check bank balance \n 2:deposit \n 3:withdraw \n 4:pin change");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:b1.Check_balance();
		 	   num++;
			  break;
			 
		case 2:b1.Deposit();
		 	  num++;
			  break;
		case 3:b1.withdraw();
		 	  num++;
			  break;
		case 4:b1.pinchange();
		 	  num++;
			  break;
		}
		}
		}
		else
		{
			System.out.println("your pin is wrong");
		}
	}
	
	}