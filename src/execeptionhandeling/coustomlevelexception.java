package execeptionhandeling;

import java.util.Scanner;

public class coustomlevelexception {
	public static void main(String[] args) {
		System.out.println("welcome to vote booth");
		Scanner sc=new Scanner(System.in);
		System.out.println("entr the age");
		int $=sc.nextInt();
		if(18<=$) {
			System.out.println("you are eleigable to vote");
			System.out.println("vote for correct party");
		}
		else
		{
			try {
				throw new notelegabletovote();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			finally {
				System.out.println("close the connection");
			}
			
			
			
		}
		
		
		
	


}
}
