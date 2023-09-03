package Protected;
public class Package12 {
		public static void main(String[] args) {
			System.out.println("in class 2 accessing static member"+package11.a);
			package11.m1();
			package11 a1=new package11();	
			System.out.println("the non stsic method from1 class 2"+a1.b);
			a1.m2();	
		}

	}



