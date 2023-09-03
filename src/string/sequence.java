package string;

import java.util.Scanner;

public class sequence {
public static void main(String[] args) {
	//String s="abcdef";
	//for (int i = 0; i < s.length(); i++) {
	//	if(i%2==0) {
		//	System.out.println(s.charAt(i));
	//	}
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=sc.nextLine();
	System.out.println("enter the string");
	String s1=sc.nextLine();
	/*
	String s2="";
	s2=s+s1;
	System.out.println(s2);
	s=s2.substring(s2.length()-s.length());
	System.out.println("after suffel"+s);
	s1=s2.substring(0,s1.length());
	System.out.println("after suffel"+s1);
	*/
	s=s+s1;
	s=s.substring(s1.length());
	System.out.println(s);
	s1=s.substring(0, (s.length()-s1.length()));
	System.out.println("s1"+s1);
	
	
		
	}
}

