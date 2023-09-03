package Abstract;

import java.util.Scanner;

public class mainclass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		pgm1.m2();
		System.out.println("enter thechocalte no");
		System.out.println("to know the manufacture of chacolate enter teh number");
		System.out.println("1.diarymilk \n 2.munch \n 3.mikeybar \n");
		int i=1;
		while(4>=i)
		{
		int a=sc.nextInt();
		switch(a)
		{
		case 1: diarymilk a1=new diarymilk();
					i++;
				a1.chacloate();
				break;
		case 2: manuch a2=new manuch();
				i++;
				a2.chacloate();
				break;
		case 3: mikeybar a4=new mikeybar();
					i++;
					a4.chacloate();
					break;
		default : System.out.println("no such other chocolate avilable in shop");
		}
		
	}

	}
}
