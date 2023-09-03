package methodoverloading;
//combination of ststic and non ststic method
import java.util.Scanner;

public class loading {
static String bankname="sbi";
static String ifsc="sbi00048sbi72";
int ac_no;
double deposit;
static double bal=100;
static String branch="holenarsipur";

public void m1() {
	Scanner sc=new Scanner(System.in);
	System.out.println("bank name is" +bankname);
	System.out.println("ifsc code is"+ifsc);
	System.out.println("enter the account number");
	ac_no=sc.nextInt();
	System.out.println(ac_no);
	System.out.println(" enter teh deposit amount");
	deposit=sc.nextDouble();
	bal=bal+deposit;
	System.out.println("after the deposit the total bank balance is "+bal);
	System.out.println("your bank branch is "+branch);
}
public void m1(String a,String b,int c,double d, String branch) {
	bankname=a;
	System.out.println("bank name is" +bankname);
	ifsc=b;
	System.out.println("ifsc code is"+ifsc);
	ac_no=c;
	System.out.println("enter the account number"+ac_no);
	deposit=d;
	bal=bal+deposit;
	System.out.println("after the deposit the total bank balance is "+bal);
	this.branch=branch;
	System.out.println("your bank branch is "+branch);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	loading a1=new loading();
	a1.m1();
	a1.m1(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.next());
	
	///loading a2=new loading();
		
	///a2.m1("karanataka",175466,2000);
	//here updated method is exicuted
	loading a2=new loading();
	a2.m1();
	a2.m1(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.next());
}

}
