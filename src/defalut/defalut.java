package defalut;

public class defalut {
	int a=10;
	char c='a';
	void m1()
	{
		System.out.println(a);
		System.out.println(c);
	}
	public static void main(String[] args) {
		defalut a1=new defalut();
		System.out.println(a1.a);
		System.out.println(a1.c);
		a1.m1();
	}
	

}
