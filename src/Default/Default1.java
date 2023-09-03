package Default;
public class Default1 {
	static int a=10;//sttsic memeber
	String b="java";//non static variable
	 static void m1()//default it will take
	 {
		 System.out.println("static method");
	 }
	 void m2() {
		 System.out.println("nonstatic method");	
	}
	public static void main(String[] args) {
		System.out.println(a);
		m1();
		Default1 a1=new Default1();
		System.out.println(a1.b);
		a1.m2();	
	}
}

