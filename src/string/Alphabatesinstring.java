package string;

import java.util.Scanner;

public class Alphabatesinstring {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
System.out.println("emnter the alphabtes with special cahrecter");
String a=sc.next();
String s1=" ";
for (int i = 0; i < a.length(); i++) {
	if(a.charAt(i)>='a' && a.charAt(i)<='z'){
		System.out.println(a.charAt(i));
	}
	
	
}
}
}
