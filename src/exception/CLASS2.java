package exception;

public class CLASS2 {
public static void main(String[] args) {
	System.out.println("MAIN STSRTS");
	System.out.println("ENETER THE ARTHAMATIC NUMBER");
	int a=10;
	try {
		System.out.println("try starts");
		System.out.println(a/0);
			System.out.println("true");
		
		System.out.println("try ends");
	}
	
	catch(ArithmeticException e) {
		System.out.println("catch stsrts");
		System.out.println(e.getMessage());
		System.out.println("catch ends");
		
		
	}
	System.out.println("main ends");
}
}
