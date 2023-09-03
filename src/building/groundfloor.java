package building;

import java.util.Scanner;

public class groundfloor extends floor1 {
	public void gf() {
Scanner sc=new Scanner(System.in);
System.out.println("you are in ground floor");

System.out.println();
int choice=sc.nextInt();
switch(choice) {
case 1:f1();
break;
case 2: f2();
	break;
}
}
}

