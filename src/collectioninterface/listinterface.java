package collectioninterface;
//linkedlist
import java.util.ArrayList;

public class listinterface {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add("ammma");
	a1.add(1);
	a1.add('a');
	a1.add("sadhu");
	a1.add("appa");
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

a1.add(5, "asharu");
System.out.println(a1);
a1.remove(3);
System.out.println(a1);
a1.addAll(5, a2);
System.out.println(a1);
System.out.println(a1.indexOf("asharu"));
System.out.println(a1.lastIndexOf(null));
System.out.println(a1.get(4));
System.out.println(a1.set(0, "appa"));
System.out.println(a1);



}
}
