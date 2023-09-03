package tyoecasting;

public class class2 extends upcasting {
	
		int v=20;
		
		public void m1()
		{
			System.out.println(v);
		}
	public static void main(String[] args) {
		upcasting a1=new class2();
		System.out.println(a1.a);
	a1.m1();
	upcasting a2=(upcasting) new  class2() ;
	System.out.println();
	System.out.println(a1.a);
	a1.m1();
	//downcasting
	class2 a3=(class2) a2;
	System.out.println(a3.v);
	a3.m1();
	System.out.println();
	class2 a4=(class2) a1;
	System.out.println(a4.v);
	a4.m1();
	
	
	
	}
	}


