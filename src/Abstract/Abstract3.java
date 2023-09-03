package Abstract;

public class Abstract3 extends Abstract2{

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("implentaion 3");
	}
public static void main(String[] args) {
	Abstract3 a1=new Abstract3 ();
	a1.m3();
	a1.m2();
	a1.m1();
}
	
}
