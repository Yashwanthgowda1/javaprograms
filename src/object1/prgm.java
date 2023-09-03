package object1;

public class prgm {
public static void main(String[] args) {
	String s="amma";
	String s1=new String("appa");
	String s2="amma";
	System.out.println(s.toString());
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s.equals(s2));
};
}
