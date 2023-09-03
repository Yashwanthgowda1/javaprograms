package string;

import java.util.Scanner;

public class removedupllicate {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String m=" ";
	String s=sc.next();
	int j;
	for (int i = 0; i <s.length(); i++) {
		int j1;
		for ( j1 = 0; j1 < i; j1++) {
			if(s.charAt(i)==s.charAt(j1)){
				break;
			}
		}
	
	
		
			if(i==j1)
			{
				m=m+s.charAt(i);
			}
		}

	System.out.println(m);
}
}
		


