package warpperclass;

public class covernontoprimative {
	public static void main(String[] args) {
		

String a="123";
int b=Integer.parseInt(a);
System.out.println(b);
int rem=0;
int sum=0;
while(b>0)
{
	rem=b%10;
	sum=sum+rem;
	b=b/10;
	
	
}
System.out.println();


}

}
