package building;

import java.util.Scanner;

public class floor1 extends floor2{
	public void f1(){
		groundfloor S1=new groundfloor();
	Scanner sc=new Scanner(System.in);
	System.out.println("your in first FLOOR");
	System.out.println(" ");
	int choice=sc.nextInt();
	switch(choice) {
	case 1: f2( );
		break;
	case 2:S1.gf();
		break;
	//default : System.out.println("you are in last floor");
	
}
	}
}
