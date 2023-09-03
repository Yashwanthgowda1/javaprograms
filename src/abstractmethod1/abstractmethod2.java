package abstractmethod1;

abstract public class abstractmethod2 {
	abstract public void m1();
	abstract public void m2();
	
	public static void m3()
	{
		System.out.println("concrete method");
	}
	public void m4()
	{
		System.out.println("non static");
	}
	public static void main(String[]args) {
		System.out.println("we canot implemntaion on non stsic method abstract method in smae class");
	
		
	}
}






