package intrface;

import java.util.Scanner;

public class mainclass {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("welcome to Atm");
	System.out.println("enter the pin");
	int pin=160590;
	int pin1=sc.nextInt();
	if(pin==pin1) {
		class4 a1=new class4();
		int i=1;
	while(4>=1) {
		System.out.println("1.deposit \n 2.checkbalance \n  3.withdarwel \n 4.pincahange");
		int choice=sc.nextInt();
		switch(choice) {
		case 1: a1.deposit();
				i++;
				break;
		case 2 : a1.checkbalance();
				i++;
				break;
		case 3: a1.withdrawel();
				i++;
				break;
		case 4: a1.pinchange();
				i++;
				pin=sc.nextInt();
				System.out.println("pin chsnge sucefully");
				break;
		default :System.out.println("enter the crt option");
				
		
		}
	}
	}
	else
	{
		System.out.println("enetr the cet pin");
	}
	
	
}

}
