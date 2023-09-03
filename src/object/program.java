package object;
public class program{
	int a;
	public static void main(String[] args) {
		program a1=new program();
		program a2=new program();
		 
		 System.out.println(a2.hashCode());
		 System.out.println(a1.equals(a2));
		 System.out.println(a1.toString());
	
	public int hashCode() {
		// TODO Auto-generated method stub
		return 123;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "amma";
	}

	
}
}