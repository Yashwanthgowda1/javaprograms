package Protected;

public class prgm1 {
protected static int a=10;
	protected String s="java";
	
	protected void name() {
		System.out.println(s);
		
	} 
	protected static void  m1() 
	{
		System.out.println("stsic method "+a);
	}
	public static void main(String[] args) {
	System.out.println("a"); 
	m1();
		prgm1 a1=new prgm1 ();
		System.out.println(a1.s);
		a1.name();
		
}
	}
