package exceptioncustomizedexception;

import java.util.Scanner;

public class unchecked {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("eneter the age");
	int a=sc.nextInt();
	
	if((a>18) ) {
		System.out.println("vote for right party");
	}
	else
	{
		try {
			throw new notelgibleforvoteException();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
}

