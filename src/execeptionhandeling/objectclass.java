package execeptionhandeling;

public class objectclass {
public static void main(String[] args) {
	
	objectclass a1=new objectclass();
	objectclass a=new objectclass();
	System.out.println(a.toString());
	System.out.println(a1.hashCode());
	
	System.out.println(a1.equals(a));
	


}

@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return 16059;
}

@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "yashwanth";
}
}
