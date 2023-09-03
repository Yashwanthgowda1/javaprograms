package intrface;

import java.util.Scanner;

public interface class1 {
	void deposit();
	
	
	
	

}
 interface class2 {
	 void checkbalance();
	 void pinchange();
}
 interface class3 extends class1,class2{
	
	 void withdrawel();
		
 }
 class class4 implements class3{

	 int amount;

	@Override
	public void deposit() {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("================");
		System.out.println("ENTER THE DEPOSIT AMOUNT");
		int amount=sc.nextInt();
		this.amount=this.amount+amount;
		System.out.println("your balance is"+this.amount);
		
	}

	@Override
	public void checkbalance() {
		System.out.println("===============");
		System.out.println("your balance is "+this.amount);
		
	}

	@Override
	public void withdrawel() {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("=============");
		System.out.println("eneter the withdrawel amount");
		int withdraw=sc.nextInt();
		if(this.amount>=withdraw) {
			this.amount=this.amount-withdraw;
			System.out.println("withdrawel sucefull");
			System.out.println("your balance is :"+this.amount);
		}
		
		
	}

	@Override
	public void pinchange() {
		// TODO Auto-generated method stub
		System.out.println("eneter the pin");
		
		
	}
	 
 }
 
 
