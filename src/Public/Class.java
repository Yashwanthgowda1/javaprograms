package Public;

 public class Class {
	 public static int a=10;//sttsic memeber
	 public String b="java";//non static variable
	 public static void m1()
	 {
		 System.out.println("static method");
	 }
	 public void m2() {
		 System.out.println("nonstatic method");
		
	}
	 public static void main(String[] args) {//because of public memeber i can acces insidee class and other class
		System.out.println("variable"+a);
		m1();
		Class a1=new Class();
		System.out.println(a1.b);
		a1.m2();
		
	}
	 

}
