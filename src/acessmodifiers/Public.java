package acessmodifiers;

public class Public {
public static int a=10;
public String s="java";
public static void m1() {
	System.out.println("stsic method "+a);
}
public void name() {
	System.out.println("non stsic "+s);
	
}
public static void main(String[] args) {
System.out.println("a"); {
	Public a1=new Public ();
	System.out.println(a1.s);
	a1.name();
	}
}

	
}


