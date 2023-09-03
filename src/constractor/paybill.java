package constractor;

import java.util.Scanner;

public class paybill extends abstract1{

	@Override
	public void hotel() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("entr thbe payment");
		int i=sc.nextInt();
	
		System.out.println("1.upi \n 2.credit card \n 3.debit card \n ");
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

}
