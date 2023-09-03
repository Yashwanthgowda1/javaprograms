package collectioninterface;

import java.util.ArrayList;
import java.util.Objects;

public class collectioninterface1 {
	public static void main(String[] args) {

	 ArrayList a1=new ArrayList();
	  a1.add(10);
	  a1.add("yashu");
	  a1.add("sadhu");
	  a1.add("amma");
	  a1.add("apppa");
	  a1.add("sharu");
	  a1.add(null);
System.out.println(a1);
ArrayList a2=new ArrayList();
a2.add(10);
a2.add("yashu");
a2.add("sadhu");
a2.add("amma");
a2.add("apppa");
a2.add("sharu");
a2.add(null);
System.out.println(a2);


a1.remove("sadhu");
System.out.println(a1);
System.out.println(a1.contains("apppa"));
System.out.println(a1);


a2.isEmpty();
System.out.println(a2.isEmpty());
System.out.println(a1.containsAll(a2));
System.out.println();
a1.retainAll(a2);
System.out.println(a1);
a1.removeAll(a2);
System.out.println(a1);
System.out.println(a2.size());
System.out.println(a1.isEmpty());
Object[] obj=a2.toArray();
System.out.println();
for (int i = 0; i < obj.length; i++) {
	System.out.println(obj[i]);
	
}
}
}