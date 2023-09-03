package Protected;
public class package11 {
	protected static int a=10;//sttsic memeber
	protected String b="java";//non static variable
	protected static void m1()
	 {
		 System.out.println("static method");
	 }
	protected void m2() {
		 System.out.println("nonstatic1234 method");
		
	}
	 protected static void main(String[] args) {//because of public memeber i can acces insidee class and other class
		System.out.println(a);
		m1();
		package11 a1=new package11();
		System.out.println(a1.b);
		a1.m2();
		
	}
	 


}
