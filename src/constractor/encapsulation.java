package constractor;

public class encapsulation {
	private String browser ;
	private	String url;
	private	String username;
	private	String password;
	private String payment;
	private int otp;
	public  String getbrowser() {
		return browser;
	}
	public void setbrowser(String a) {
		// TODO Auto-generated method stub
		browser =a;
	}
	public String geturl() {
		return url;
	}
	
	public String getusername() {
		return username;
	}
	public String getpassword() {
		return password;
	}
	public void seturl(String url) {
		this.url=url;
		
	}
	public int getotp(){
		return otp;
		
	}
	public String getpayment() {
		return payment;
	}
	public void setusername(String a) {
		username=a;
		
	}
	public void setpassword(String a) {
		 password =a;
	}
	public void setpayment(String a) {
		payment=a;
	}
	public void setotp(int randowmnum) {
		otp=randowmnum;
	}
	
}
