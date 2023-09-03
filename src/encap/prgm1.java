package encap;
import java.util.*;
public class prgm1 {
	private String browser;
	private String url;
	
	private String username;
	private String passward;
	private String paymentoption;
	//___gettre____
	public  String getusername()
	{
		return username;
		
	}
	public  String getbrowser()
	{
		return browser;
		
	}
	public  String geturl()
	{
		return url;
		
	}
	public  String getpassward()
	{
		return passward;
		
	}
	public  String getpaymentoption()
	{
		return paymentoption;
		
	}
	
	public void setpassward(String b)
	{
		passward=b;
	}
	public void setbrowser(String c)
	{
		browser=c;
	}
	public void seturl(String d)
	{
		url=d;
	}
	public void setusername(String a)
	{
		username=a;
	}
	public void setpaymentoption(String a)
	{
		paymentoption=a;
	}
	//___
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		prgm1 a1=new prgm1();
		a1.setbrowser("chrome");
		a1.setpassward("12345");
		a1.seturl("www.amazon.com");
		a1.setusername("sadhu");
		System.out.println("select cash fromate");
		String cash=sc.nextLine();
		switch(cash)
		{
		case "cod" : a1.setpaymentoption("cash on delivery");
		break;
		case "debit card" : a1.setpaymentoption("debit card");
		break;
		
		case "upi" : a1.setpaymentoption("upi");
		break;
		default : System.out.println("not avilable");
		}
	System.out.println("enter the browser");
		String browser=sc.nextLine();
		if(browser.equals(a1.getbrowser())) {
			System.out.println("enter the url");
			String url=sc.nextLine();
			if(url.equals(a1.geturl())) {
				System.out.println("enter the user name");
				String username=sc.nextLine();
				if(username.equals(a1.getusername())) {
					System.out.println("enter the passward");
					String passward=sc.nextLine();
					if(passward.equals(a1.getpassward())) {
						System.out.println("welcome to home pages");
						System.out.println("select order");
						System.out.println("order selected");
						System.out.println("enter the user payment option");
							String payment=sc.nextLine();
							if(payment.equals(a1.getpaymentoption())) {
								System.out.println("orderd sucesfully");
							}
							else
							{
								System.out.println("payment option not there");
							}
						}
					
					
					else {
						System.out.println("check passward");
					}
				}
				else
				{
					System.out.println("check user name");
				}
			}
			else
			{
				System.out.println("check url"); 		
			}
		}
		else
		{
			System.out.println("browser wrong");
		}
		}
	
		
		}
	
	


