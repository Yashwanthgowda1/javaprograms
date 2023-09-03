package string;

import java.util.Scanner;

public class paladrom {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String a=sc.next();
		String s1="";
		for (int i = a.length()-1; i >=0; i--) {
			s1=s1+a.charAt(i);
			
			
		}
		System.out.println(s1);
		if(a.equals(s1))
		{
		System.out.println("it is a palidome");
	}
		else
		{
			System.out.println("not a palide=rome");
		}

}
}
