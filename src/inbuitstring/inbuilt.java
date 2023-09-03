package inbuitstring;

public class inbuilt {
	public static void main(String[] args) {
		
	
String s="amma";
String s1=new String("appa");
String s2="yashu";
String a=new String("i love apppa");
System.out.println(s.length());

for (int i = 0; i < s.length(); i++) {
	System.out.println(s1.charAt(i));
}

char[] ch=s.toCharArray();
for (int i = 0; i < ch.length; i++) {
	System.out.println(ch[i]);
}
System.out.println(s2.indexOf('s'));
System.out.println(s2.lastIndexOf('u'));
System.out.println(s1.substring(1));
System.out.println(s1.substring(0,3));
System.out.println(s1.contains("w"));
System.out.println(s1.toLowerCase());
System.out.println(s1.toUpperCase());
System.out.println(s1.concat(s1));
System.out.println(s1.startsWith("w"));
System.out.println(s.endsWith("a"));
String[] cha=s.split("");
for (int i = 0; i < cha.length; i++) {
	System.out.println(cha[i]);
}

System.out.println(s.replace("amma", "sukanya"));
	}
}


	