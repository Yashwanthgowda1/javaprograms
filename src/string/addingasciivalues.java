package string;

import java.util.Scanner;

public class addingasciivalues {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=sc.nextLine();
	int sum=0;
	for (int i = 0; i < s.length(); i++) {
		int a=(int)s.charAt(i);//expliciltly type casting
		sum=sum+a;
		
	}
	System.out.println(sum);
	
	
}
}
