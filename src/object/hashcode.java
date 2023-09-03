package object;

public class hashcode {
public static void main(String[] args) {
	hashcode a1=new hashcode();
	hashcode a2=new hashcode();
	System.out.println(a1.hashCode());
	System.out.println(a1.toString());
	System.out.println(a1.equals(a1));
	
	/*System.out.println(a2.toString());
	System.out.println(a2.hashCode());
	System.out.println(a1.equals(a2));
	hashcode a3=a1;
	System.out.println(a3.hashCode());
	System.out.println(a2.toString());
	System.out.println(a2.equals(a1));
	System.out.println(a3.equals(a1));
	*/

}

@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return 123456;
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
