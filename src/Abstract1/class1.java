package Abstract1;

import java.util.Scanner;

abstract public class class1 {
	abstract public void deposit();
	abstract public void checkbalance();
	abstract public void withdrawel();
	public class1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter teh pin");
		
		int pin=160590;
		int pin1=sc.nextInt();
		if(pin==pin1) {
			
			System.out.println("welcome to Atm");
			System.out.println("entr the option");
			int i=0;
			while(1>=0) {
				
			
			System.out.println("1.deposit \n 2.checkblance \n 3.withdrawel");
			int choice=sc.nextInt();
			switch(choice) {
			case 1: deposit();
					i++;
					break;
			case 2: checkbalance();
					i++;
					break;
			case 3: withdrawel();
					i++;
					break;
			default : System.out.println("enter the correct option");
					
					
			}
			
		}
		}
		
	}


}
class class2 extends class1{
	
	
	double amount;
	 
	public class2() {
		System.out.println("bank balance is "+this.amount);
		 System.out.println("thank you");
	 }

	@Override
	public void deposit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the deposite amount");
		System.out.println("===========================");
		System.out.println();
		double amount=sc.nextDouble();
		this.amount=this.amount+amount;
		
	
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkbalance() {
		System.out.println("==========================");
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawel() {
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter the withdrawel amount");
		double withdrawel=sc.nextDouble();
		if(this.amount>=withdrawel) {
			this.amount=this.amount-withdrawel;
			
		}
	}
	
	class mainmethod{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		class2 a1=new class2();
		
		
	}
	
}
}
