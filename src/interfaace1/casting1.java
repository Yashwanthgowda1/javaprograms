package interfaace1;

public class casting1 extends casting {
	int a=20;
	String b="yashu";
	public void m1() {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		casting1 a=new casting1();
		a.m1();
		casting a1	=new casting1();
		a1.m1();
		casting a2=(casting)new casting1();
	System.out.println(a2.a);
	casting1 a3=(casting1)a2;
	System.out.println(a3.a);
a3.m1();		
		
	}
	

}
