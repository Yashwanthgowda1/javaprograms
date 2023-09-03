package string;

public class stringinbuiltmethod {
public static void main(String[] args) {
	String a=new String("Amma");
	String s="AMMA";
	String s2=new String("appa");
	String s3="amma i love you";
	
	System.out.println(a.toUpperCase());
	System.out.println(s2.toUpperCase());
	System.out.println(s.toLowerCase());
	System.out.println(a.length());
	System.out.println(s.length());
	System.out.println(s2.length());
	System.out.println(a.charAt(2));
char b[] = a.toCharArray();
for (int i = 0; i < b.length; i++) {
	System.out.println(b[i]);
	
	
}
System.out.println(a.substring(1));
System.out.println(s.substring(1, 4));//beging index strat with oth index form but last indext strts with 1st indrx form
System.out.println(a.concat(s2));
System.out.println(a.contains(s2));
System.out.println(a.contains("Amma"));
System.out.println(a.indexOf('m'));
System.out.println(s2.lastIndexOf('a'));
System.out.println(a.replace('A', 'a'));
String m[]=s3.split(" ");
for (int i = 0; i < m.length; i++) {
	System.out.println(m[i]);
	
}
System.out.println(s.startsWith("a"));
System.out.println(a.endsWith("a"));

}

}
