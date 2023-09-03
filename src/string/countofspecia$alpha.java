package string;

import java.util.Scanner;

class countofspecia$alpha {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=sc.next();
	int count=0;
	int count1=0;
	int count2=0;
	for (int i = 0; i < s.length(); i++) {
		if(s.charAt(i)>='a' && s.charAt(i)<='z' ||s.charAt(i)>='A' && s.charAt(i)<='Z' ){
			count++;
			
		}
		
		else if(s.charAt(i)>='0' && s.charAt(i)<='9'  )
	
	{
				count1++;
				
			}
		else
		{
		count2++;
		}
		
		
	}
		
		System.out.println(count1+"number ");
		System.out.println("alphabate:"+count);
		System.out.println("specialchar:"+count2);
}
}
/*
enter the string
hvfvjtdsj43661jhbhghvt#$%^&
5number 
alphabate:17
specialchar:5
*/