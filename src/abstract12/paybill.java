package abstract12;

import java.util.Scanner;

import constractor.abstract1;

public class paybill extends abstract1{

	@Override
	public void hotel() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the payment");
		
	
		System.out.println("1.upi \n 2.credit card \n 3.debit card \n ");
		int i=sc.nextInt();
		switch(i) {
		case 1:System.out.println("scann the qr code");
				System.out.println("enter the otp");
				System.out.println();
		
			System.out.println("payment done sucessufully");
			break;
		case 2: System.out.println("payment done sucefully by credit card");
		break;
		case 3: System.out.println("payment done by debit card");
		break;
		default : System.out.println("no other payment option");
		}
	}
public static void main(String[] args) {
	menu a=new menu();
	a.hotel();
	paybill a1=new paybill();
	a1.hotel();
	
}
}
