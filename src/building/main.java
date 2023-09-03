package building;

import java.util.Scanner;

public class main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the pin");
	int pin=573211;
	int pin1=sc.nextInt();
	if(pin1==pin)
	{
		System.out.println("welcome to life");
		groundfloor a1=new groundfloor();
		a1.gf();
		
	}
	else
	{
		System.out.println("chage pin");
		pin=sc.nextInt();
		System.out.println("your updated pin");
	}
	
}
}
