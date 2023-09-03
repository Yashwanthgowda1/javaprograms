package Abstract;

import java.util.Scanner;

public class DISPALY extends Banking {
	

	public void Atm() {
	
		// TODO Auto-generated method stub
		System.out.println(" welcome to home page");
			System.out.println("enter the option");
	}
	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

		
		double amount = 0;
		while(1>0) {
				
				System.out.println();
				System.out.println("1.Deposit amount \t 3. check balance \t 2. withdrawel");
		
				int option=sc.nextInt();
				
				switch(option)
				{
				case 1 : System.out.println("enter the deposit amount");  
							double a=sc.nextDouble();
							amount=amount+a;
							System.out.println("ur deposit amount is:"+amount);
							break;
				case 2: System.out.println("enter the withdrawel");
						double withdrawel=sc.nextDouble();
						if(amount>=withdrawel) {
						amount=amount-withdrawel;
						
						System.out.println("ur withdrawel amount is:"+amount);
						}
						else
						{
							System.out.println("u r account dont have sufficent balance");
						}
						break;
				case 3: System.out.println("enter the check balance");
						System.out.println("ur account balance is" +amount);
						break;
			default: System.out.println("we are working on it");
	
			
				}
	
	}
}
}


				
			
	



