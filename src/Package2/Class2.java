package Package2;
import Public.Class;//import pakage name.class name to access in aother package

public class Class2 {
	public static void main(String[] args) {
		System.out.println(Class.a);
		Class.m1();// if i wanted to access in other pakage of static member so taht i access by classname.stsicname
	
		Class a1=new Class();
		System.out.println(a1.b);
		a1.m2();
		
	}

}
