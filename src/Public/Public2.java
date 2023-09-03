package Public;

public class Public2 {
	public static void main(String[] args) {
		System.out.println("in class 2 accessing static member"+Class.a);
		Class.m1();
	Class a1=new Class();	
		System.out.println("the non stsic method from class 2"+a1.b);
		a1.m2();	
	}

}
