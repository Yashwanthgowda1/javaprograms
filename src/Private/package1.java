package Private;
public class package1 {
	 private static int a=10;//sttsic memeber
	private String b="java";//non static variable
	private static void m1()
	 {
		 System.out.println("static method");
	 }
	 private void m2() {
		 System.out.println("nonstaticz method");
		 
	 }
	 public static void main(String[] args) {//because of public memeber i can acces insidee class and other class
			System.out.println(a);
			m1();
			package1 a1=new package1();
			System.out.println(a1.b);
			a1.m2();
}
}
		


