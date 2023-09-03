package collectioninterface;

import java.util.ArrayList;


public class onlyintergervalues {
public static void main(String[] args) {
	 ArrayList a1=new ArrayList();
	  a1.add(10);
	  a1.add("yashu");
	  a1.add("sadhu");
	  a1.add("amma");
	  a1.add("apppa");
	  a1.add("sharu");
	  a1.add(null);
	  a1.add(20);
System.out.println(a1);
System.out.println("only interger object");
for (int i = 0; i <a1.size(); i++) {
			Object obj=a1.get(i);
if(obj instanceof Integer) {
	System.out.println(obj);
}
	
}
}
}
