package collectioninterface;

import java.util.ArrayList;

public class ilastindex {
	public static void main(String[] args) {
		
	
	 ArrayList a1=new ArrayList();
	  a1.add(10);
	  a1.add("yashu");
	  a1.add("sadhu");
	  a1.add("amma");
	  a1.add("apppa");
	  a1.add("sharu");
	  a1.add("maamr");
	  a1.add(null);
System.out.println(a1);

for (int i = 0; i < a1.size(); i++) {
	Object obj=a1.get(i);
	if(obj instanceof String) {
		String a=(String)obj;
		if(a.charAt(a.length()-1)=='s' || a.charAt(a.length()-1)=='a' || a.charAt(a.length()-1)=='r'){
			System.out.println(a);
		}
				
	}
}
	
}
}
