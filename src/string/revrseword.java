package string;

import java.util.Scanner;

public class revrseword {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=sc.nextLine();
	String []s1=s.split(" ");
	for (int i =s1.length-1; i >=0; i--) {
		System.out.println(s1[i]);
		
	}
}
}
