package building;
import java.util.*;
public class floor2 {
	public void f2() {
		groundfloor s2=new groundfloor();
		Scanner sc=new Scanner(System.in);
		System.out.println("your in second FLOOR");
		System.out.println();
		int choice=sc.nextInt();
		switch(choice) {
		case 1:s2.f1();
			break;
		case 2: s2.gf();
			break;
		//default : System.out.println("you are in last floor");
		
		}
	}

}
