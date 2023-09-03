package abs;

public class abstract1 extends Abstract {

	
	public void pack1() {
		System.out.println("implimentation abstract");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Abstract.m2();
		abstract1 a1=new abstract1();
		a1.pack1();
		a1.m3();
	}
	
	

}
