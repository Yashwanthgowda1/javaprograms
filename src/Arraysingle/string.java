package Arraysingle;

import java.util.Scanner;

public class string {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	String s="abcd";
	String g=sc.nextLine();

	
	
		
		for(int i=0;i<g.length();i++) {
			if(g.charAt(i)>='a' && g.charAt(i)<='z' || g.charAt(i)>='A' && g.charAt(i)<='Z') {
				
				System.out.println(g.toUpperCase());
			
			}
			
			
	}
			
}
}


