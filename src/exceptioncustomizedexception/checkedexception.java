package exceptioncustomizedexception;

import java.util.Scanner;

public class checkedexception 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the marriage age of male:");
	double a=sc.nextDouble();
	System.out.println();
	System.out.println("enter the maerrage age of female");
	double s=sc.nextDouble();
	
	if((a>=21 && s>=18) ){
		System.out.println("happy married life and all the best for the feature");
		
		
	}
	else
	{
		try {
			
		throw new heisnotelgiabletomerryException();

		
	}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	
}
}
}
