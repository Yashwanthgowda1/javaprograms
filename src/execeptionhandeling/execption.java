package execeptionhandeling;

public class execption {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	try {
		System.out.println("try startes");
		System.out.println(a[6]);
		System.out.println("try ends");
	}
	catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
	System.out.println(e.getMessage());
	System.out.println(e.getStackTrace());
	System.out.println(e.getLocalizedMessage());
	}
	}
}

