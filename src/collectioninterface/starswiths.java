package collectioninterface;

import java.util.ArrayList;

public class starswiths {
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

for (int i = 0; i < a1.size(); i++) {
	Object a=a1.get(i);
	if(a instanceof String) {
		String d=(String)a;
		if(d.charAt(0)=='s' || d.charAt(0)=='S') {
			System.out.println(d);
	
	}
	
	}
	
}

}
}
