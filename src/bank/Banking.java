package bank;

import java.util.Scanner;

public abstract class Banking {
	abstract public void deposite();
		abstract public void withdrawel();
	abstract public void pin();
}
class bank extends Banking
{
	double amount;
	int pin=573211;
	@Override
	public void deposite() {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("enter the deposite amount");
		System.out.println("=====================================");
		double deposite=sc.nextDouble();
		System.out.println("balance: " + " "+deposite+" ");
		amount=amount+deposite;
		System.out.println(" u r total balance is: "+amount);
	}

	@Override
	public void withdrawel() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter the withdrawel amount");
		System.out.println("=====================================");
		double withdrawel=sc.nextDouble();
		if(amount>=withdrawel)
		{
			System.out.println("withdrawel :"+ withdrawel);
			amount= amount-withdrawel;
			System.out.println("balance: " +amount);
		}
		else
		{
			System.out.println("sufficent amount is not there");
		}
		
		
		
	}

	@Override
	public void pin() {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("enter the pin change");
		pin=sc.nextInt();
		System.out.println("your updated pin is: "+ pin);
		
	}
}

	
	


	

		
		
			
		
	
	
	
	


