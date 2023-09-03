package string;

import java.util.Scanner;

public class numericalonly {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String a=sc.next();
		String b=" ";
		for (int i = 0; i < a.length(); i++) {
			if(a.charAt(i)>='0' && a.charAt(i)<='9') {
				System.out.println(a.charAt(i));
				
			}
					
		}
		

	}
}
