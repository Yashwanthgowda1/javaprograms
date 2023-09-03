package string;

import java.util.Scanner;

public class noumberofwords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
	
		int count=0;
		String []s2 = s.split(" ");
		
		for (int i=0; i<s2.length; i++) {
				
			count++;
			System.out.println(s2[i]);
		
		}
		System.out.println("total number of string: "+count);


	}

}

/*
enter the string
jvmf mgvv,y  rvuylb jfvytv
the number of words present in java4
*/