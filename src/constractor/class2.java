package constractor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class class2 {
	public static void main(String[] args) {
		encapsulation a=new encapsulation();
	Scanner sc=new Scanner(System.in);
//	System.out.println("chose the browser"+"\t"+"1.chrome \t"+"2.firefox \t"+"3.edge ");
////	int s=sc.nextInt();
//	sc.next();
	 a.setbrowser("chrome");
	
//	case 2: a.setbrowser("firefox");
//	break;
//	case 3:  a.setbrowser("edge");
//	break;
//	default: System.out.println("browser is not avilable");
//	}
	a.seturl("www.yashwanth.com");
	a.setusername("yashu");
	a.setpassword("yashu123");
	System.out.println("entre the browser");
	String b=sc.nextLine();
	if(a.getbrowser().equals(b)) {
		System.out.println("entr the url");
		String url=sc.nextLine();
		if(a.geturl().equals(url)) {
			System.out.println("entre the username");
			String h=sc.nextLine();
			if(a.getusername().equals(h)) {
				System.out.println("entr the passward credential");
				String password=sc.nextLine();
				if(a.getpassword().equals(password)) {
					
				
			
					System.out.println("select the source");
					System.out.println("select the destination");
					System.out.println("entr the otp");
					
					
					
					
					Random random=new Random();
					int randowmnum=random.nextInt(200);
					System.out.println(randowmnum);
					a.setotp(randowmnum);
					System.out.println();
					System.out.println("entr the otp");
					int otp1=sc.nextInt();
					if(a.getotp()==otp1) {
					
						System.out.println("cab booked sucefull select payment option");
						
						System.out.println("1.debit card \t 2.creditcard \t 3.cash \t 4.upi" );
						int i=sc.nextInt();
						switch(i) {
						case 1: a.setpayment("debit card");
						break;
						case 2: a.setpayment("creditcard");
						break;
						case 3: a.setpayment("cash");
						break;
						case 4: a.setpayment("upi");
						break;
						default: System.out.println("payment option not accepted");
						}
						
							System.out.println("payment is done sucefull");
							Date fromate=new Date();
							SimpleDateFormat sdf =new SimpleDateFormat("hh_mm");
							String date=sdf.format(fromate);
							String[] date1=date.split("_");
							int hr=Integer.parseInt(date1[0]);
							int mm=Integer.parseInt(date1[1]);
							int add=(mm+20);
							
							
							System.out.println("cab is arriving with in "+hr+":"+add+"mm");
					}
							
						
					else
					{
						System.out.println("eter the otp properly");
					}
				}
				else
				{
					System.out.println("entr the passward crt");
					
					
					
				}
			}
			else
			{
				System.out.println("entr the user name crt");
				
			}
		}
		else
		{
			System.out.println("enter the url crt");
		}
		
	}
	else {
		System.out.println("browser is not insatlled");
	}
	
	
	}

}
	
