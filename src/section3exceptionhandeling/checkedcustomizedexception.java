package section3exceptionhandeling;

import java.util.Scanner;

public class checkedcustomizedexception {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the values male");
		System.out.println("entr the female age");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>=21 && b>=18) {
			System.out.println("happy maerrage life");
		}
		else
		{
			try {
				throw new notelegableException1();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	}


