package constractor_overloading;
//generaly go for the data table eneter the value

import java.util.Scanner;

public class loading {
	String name;
	int id;
	int phno;
	char gender;

	public loading() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		name = sc.nextLine();
		System.out.println("enter the id");
		id = sc.nextInt();
		System.out.println("enter the phno");
		phno = sc.nextInt();
		System.out.println("	enter the gender");
		gender = sc.next().charAt(0);
	}

	public loading(String name, int id) {

		System.out.println(this.name = name);
		System.out.println(this.id = id);

	}

	public loading(String name, int id, int ph, char gender) {
		this.name = name;
		this.id = id;
		phno = ph;
		this.gender = gender;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		loading a1 = new loading();
		System.out.println(a1.gender);
		System.out.println(a1.id);
		System.out.println(a1.phno);
		System.out.println(a1.name);
		System.out.println("");
		loading a2 = new loading("amma", 12);
		System.out.println(" ");
		System.out.println("enter the user values");
		loading a3 = new loading(sc.next(), sc.nextInt(), sc.nextInt(), sc.next().charAt(0));
		System.out.println(a3.name);
		System.out.println(a1.id);
		System.out.println(a1.gender);
		System.out.println(a1.phno);

	}

}
