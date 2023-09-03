package exception;

import java.util.Scanner;

public class handels {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("main starts");
	System.out.println("enter the digits");
	int arr[]=new int[5];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	try {
		System.out.println("try starts");
	System.out.println(arr[6]);
	System.out.println("try ends");
	
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("catch starts");
		System.out.println(e.getMessage());
		System.out.println("CATCH ENDS");
	
	}
	System.out.println("MAIN ENDS");
}
}
