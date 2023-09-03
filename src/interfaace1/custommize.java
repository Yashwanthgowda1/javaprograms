package interfaace1;

import java.util.Scanner;

public class custommize {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("vote start");
		System.out.println("enter he age of candidate");
		int a=sc.nextInt();
		
	
		if(a>=18) {
			System.out.println("eligable to vote");
		}
		else {
		try {
			throw new noteligabletovoteexception();
		}
		
		catch(Exception e){
		
			System.out.println(e.getMessage());
			
		}
		
		finally {
			System.out.println("connection closed");
			
		}
	}
		System.out.println("ends vote");
		
	}
}


