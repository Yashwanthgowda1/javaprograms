package warpperclass;
import java.lang.*;
public class wrapperclass {
	public static void main(String[] args) {
		int a=10;
		Integer b=a;
		System.out.println(b);//implicitly unboxing
		//explictly
		int c=10;
		Integer m=Integer.valueOf(c);//explicitlyunboxing
		System.out.println(m);
		//----------------------
		int x=b;
		System.out.println(x);//implictly unboximng
		double s=m.doubleValue();//explixitly unboxing
		System.out.println(s);
	}

}
