package constractor;

public class co {
public static void co(int a) {
	System.out.println(a);
}
public static  void co(int a,String b) {
	System.out.println(a+b);
	
}
public void co(String a,double c)
{
	System.out.println(c);
	System.out.println(a);
}
public static void main(String[] args) {
	co(10);
	co(10,"java");
	co a=new co();
	
	a.co("java",20.366);
	a.co("java", 888.23);
	
}

}
