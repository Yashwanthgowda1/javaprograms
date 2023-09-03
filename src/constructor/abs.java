package constructor;

import java.util.Scanner;

public class abs {
	String name;
	int id;
	int phno;
	char gender;
	public abs() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		name=sc.nextLine();
		System.out.println("enter the id");
		id=sc.nextInt();
		System.out.println("enter the phno");
		phno=sc.nextInt();
	System.out.println("	enter the gender");
		gender = sc.next().charAt(0);
		
	}
	public static void main(String[] args) {
		abs a1=new abs();
		System.out.println(a1.name);
		System.out.println(a1.id);
		System.out.println(a1.gender);
		System.out.println(a1.phno);
	}
}
