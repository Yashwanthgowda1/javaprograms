package Protected2;
import Protected.package11;
public class package13 extends package11 {
	public static void main(String[] args) {
		System.out.println("in class 2 accessing static member"+package11.a);
		package11.m1();
		package13 a1=new package13();	
		System.out.println("the non stsic method from2 class 2"+a1.b);
		a1.m2();	
	}

}
