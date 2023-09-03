package section3exceptionhandeling;

public class handelexception {
public static void main(String[] args) {

	System.out.println("main starts");
	try {
		System.out.println("try stsrts");
		throw new ArithmeticException();
		
	}
	catch(ArrayIndexOutOfBoundsException b)
	{
		System.out.println("catch starts");
		System.out.println(b.getMessage());
		System.out.println("catch ends");
	}
	catch(ArithmeticException e) {
		System.out.println("2nd catch starts");
		System.out.println(e.getMessage());
		System.out.println("2nd catch ends");
	}
	catch(StringIndexOutOfBoundsException j) {
		System.out.println("3rd start");
		System.out.println(j.getMessage());
		System.out.println("3rd ends");
	}

	System.out.println("main ends");
	
}
}
