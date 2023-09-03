
//abstarct class by Atm
package Abstract11;

import java.util.Scanner;

abstract public class class1 {
	abstract public void deposit();
	abstract public void checkbalance();
	abstract public void withdrawel();
	abstract public void exit();
	public class1() {
		System.out.println("welcome to Atm");
		
		
	}
}
	



class class2 extends class1{
	
	
	double amount;
	int pin=160590;
	 
	public class2() {
		Scanner sc=new Scanner(System.in);
		int pin1=sc.nextInt();
		
		if(this.pin==pin1) {
			
			System.out.println("entr the option");
		int i=1;
		while(2>=1)
		{
				
			
			System.out.println("1.deposit \n 2.checkblance \n 3.withdrawel \n 4.exit");
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
			case 4: exit();
					i++;
					break;
			default : System.out.println("enter the correct option");
						System.out.println("vist once again");
					
					
			}
			
		}
		}
	
	 }

	@Override
	public void deposit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the deposite amount");
		System.out.println("===========================");
		System.out.println();
		double amount=sc.nextDouble();
		this.amount=this.amount+amount;
		System.out.println("YUR BALANCE IS"+this.amount);
		
	
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkbalance() {
		System.out.println("==========================");
		System.out.println("YUR BALANCE IS"+this.amount);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawel() {
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter the withdrawel amount");
		double withdrawel=sc.nextDouble();
		if(this.amount>=withdrawel) {
			this.amount=this.amount-withdrawel;
			System.out.println("YUR BALANCE IS"+this.amount);
			
		}
		else
		{
			System.out.println("maintain sufficent balance");
		}
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		System.out.println("thank exiting");
		
	}
	
	
	
		
		
	}

	

