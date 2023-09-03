package medicalshop;
import java.util.Scanner;
public class medicalshop1 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter the use for");
			String name=sc.nextLine();
			switch(name)
			{
			case "fever" : paracitamale a1=new paracitamale();
								a1.tablet();
								System.out.println("per tab 5");
								break;
			case "accidity" : omini a2=new omini();
								a2.tablet();
								System.out.println("per tab 2rs");
								break;
			case "fat" : ecosprin a3=new ecosprin();
							a3.tablet();
							System.out.println("per tab 2.8rs");
							break;
			case "bp" : telmikind a4=new telmikind();
							a4.tablet();
							System.out.println("per tab 3.5rs");
							break;
			default : System.out.println("not avialable");
		
	}
	}

}
