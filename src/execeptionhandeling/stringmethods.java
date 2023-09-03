package execeptionhandeling;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class stringmethods {
	public static void main(String[] args) {
//		String a=new String("10");
//		String a1="10";
//		String g="yashwanth";
//		String d="how are you";
//		System.out.println(a.length());
//		for (int j = 0; j <g.length(); j++) {
//			
//		
//		System.out.println(g.charAt(j));
//		}
//		System.out.println();
//		char a4[]=g.toCharArray();
//		for (int i = 0; i < a4.length; i++) {
//			System.out.print(" "+a4[i]);
//			
//		}
//		System.out.println(g.toUpperCase());
//		System.out.println("upper to lower");
//		System.out.println(g.toUpperCase().toLowerCase());
//		System.out.println(g.concat(g));
//		System.out.println(g.contains(a1));
//		String l[]=d.split(" ");
//		for (int i = 0; i < l.length; i++) {
//			System.out.print(l[i]);
//			
//		}
//		System.out.println("replace");
//		System.out.println(d.replace("h", "g"));
//		System.out.println(d.lastIndexOf("u"));
//		System.out.println(d.indexOf("y"));
//		System.out.println("substring");
//		System.out.println(d.substring(1));
//		System.out.println(d.substring(1, 4));
//		System.out.println(d.startsWith("y"));
//		System.out.println(d.endsWith("u"));
//	for (int i = 0; i < g.length(); i++) {
//		int j;
//		for (j  = 0; j < g.length(); j++) {
//			if(g.charAt(i)==g.charAt(j)) {
//				break;
//			
//		}
//		}
//		if(i==j) {
//			System.out.println(g.charAt(i));
//		}
//	}
//	g=g+d;
//	System.out.println(g);
//	d=g.substring(0,(g.length()-d.length()));
//	System.out.println(d);
//	System.out.println();
//	g=g.substring(d.length());
//	System.out.println(g);
//	}
//		int a=10;
//		int j=10;
//		double __=35;
//	Integer d=a;//implicilty
//	Integer h=(Integer)j;//explicitly
//	System.out.println(d.hashCode());
//	System.out.println(h);
//	String o="12345a";
//	String t="";
////	int f=Integer.parseInt(o);
////	System.out.println(f);
//	t=o.replaceAll("[^0-9]", "");
//	System.out.println(t);
//int f	=Integer.parseInt(t);
//System.out.println(f);
//	
//	ArrayList<Integer> a=new ArrayList<Integer>();
//	a.add("yashwanth");
//	a.add(10);
//	a.add(13);
//	a.add('c');
//	a.add('n');
//	a.add("appa");
//	
//	ArrayList a1=new ArrayList<>();
//	a1.add("shrath");
//	a1.add("10");
//	a1.add("13");
//	a1.add('z');
//	a1.add('m');
//	a1.add("amma");
////	System.out.println(a);
////System.out.println(a1);
////System.out.println(a.size());
////System.out.println(a1.size());
////System.out.println(a.contains("yashwanth"));
////System.out.println(a.containsAll(a1));
////a.retainAll(a1);
////System.out.println(a);
////System.out.println(a.size());
////System.out.println(a.containsAll(a1));
////a.remove("10");
////System.out.println(a);
////a.removeAll(a1);
////System.out.println(a);
////System.out.println(a1);
////Object[] obj=a.toArray();
////for (int i = 0; i < obj.length; i++) {
////	System.out.println(obj[i]);
////	
////	
////}
////a.clear();
////System.out.println(a);
////	//int p=(int)o;//noumberformateexpection
////	for (int i = 0; i < o.length(); i++) {
////		if(o.charAt(i)>='1'&& o.charAt(i)<='9') {
////			String r=(String)o.charAt(i);
////			int y=Integer.parseInt(r);
//			
//			a.add("sukanya");
//			String d=null;
//			for (int i = 0; i < a.size(); i++) {
//		Object obj=(a.get(i));
//		if(obj instanceof String)
//		{
//			 d=(String)obj;
//			System.out.println(d);
//		}
//		
//		for (int j = 0; j < d.length(); j++) {
//			if(d.charAt(0)=='s'|| d.charAt(0)=='S') {
//				System.out.println(d);
//			}
//		
//ArrayList<Integer> a=new ArrayList<Integer>();
//a.add(10);
//a.add(4);
//a.add(4);
//a.add(10);
//a.add(15);
//LinkedHashSet<Integer> d=new LinkedHashSet<Integer>(a);
//System.out.println(d);
String a="raja123@boja$5896";
ArrayList a1=new ArrayList();

for (int i = 0; i < a.length(); i++) {
	
	a1.add(a.charAt(i));
	
//	if (a.charAt(i)>='a' && a.charAt(i)<='z' ||a.charAt(i)>='0' && a.charAt(i)<='9')
//	{
//		a1.add(a.charAt(i));
//	}
	
		
	
	
}
System.out.println(a1);
LinkedHashSet<Integer> m=new LinkedHashSet<Integer>(a1);
System.out.println(m);

	
	
	}
	

			
		}
		
			
					
				
			
			
			
			
		
		
				
			
			
		
		
	
	






