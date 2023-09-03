package string;
//over riding instring object class method
public class stringCLASS {
	public static void main(String[] args) {
		
	
	String a="amma";
	String a1=new String("appa");
	String a2=new String("amma");
	String a4="amma";
	
	System.out.println(a.toString());
	System.out.println(a1.toString());
	System.out.println(a4.toString());
	System.out.println(a2.toString());
	System.out.println();
	System.out.println(a1.hashCode());
	System.out.println(a.hashCode());
	System.out.println(a2.hashCode());
	System.out.println(a4.hashCode());
	System.out.println();
//	System.out.println(a1.equals(a));
	System.out.println(a4.equals(a)); 
	
	System.out.println(a.equals(a4));
	System.out.println(a1.equals(a2));
	System.out.println(a.equals(a4));
	System.out.println(a2.equals(a4));
	


	

}
}
