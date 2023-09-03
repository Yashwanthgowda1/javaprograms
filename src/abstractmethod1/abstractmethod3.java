package abstractmethod1;

 public class abstractmethod3 extends abstractmethod2 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("acccsses");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("acccssesed");
	}
	public static void main(String[] args) {
		abstractmethod3 a1=new abstractmethod3();
		a1.m1();
		a1.m2();
		 abstractmethod2.m3();
		
	}
	

		
		
		
	

}
