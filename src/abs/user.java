package abs;
import java.util.*;
public class user {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the code");
		int a=sc.nextInt();
		switch(a)
		{
			case 1: mango a1=new mango();
						a1.chacolate();
							break;
			case 2: kachamango a2=new kachamango();
						a2.chacolate();
						break;
			case 3: red a3=new red();
						a3.chacolate();
						break;
			default : System.out.println("no chocaltes avilable");
		}
		
		
		
		
	}

}
