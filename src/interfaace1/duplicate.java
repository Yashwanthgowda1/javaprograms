package interfaace1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

import constractor.in;

public class duplicate {
	
	public static void main(String[] args) {
String s="rajarajeswari12355";
String g="";
	LinkedHashSet<Character> a=new LinkedHashSet<Character> ();
	for(int i=0;i<s.length();i++) {
		a.add(s.charAt(i));
	}
	
	System.out.println(a);
	
	Iterator itr=a.iterator();
	while(itr.hasNext()) {
		Object obj=itr.next();
		if(obj instanceof Character) {
			char a1=(char)obj;
			if(a1>='a' && a1<='z') {
			g=g+a1;
		}
	}
	
	
	

	
	
	
	
	 
		-
		
}
	System.out.println(g);
}
}