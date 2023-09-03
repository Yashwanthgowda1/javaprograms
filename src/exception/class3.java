package exception;

import java.io.IOException;

public class class3 {
	public static void main(String[] args) {
		System.out.println("not handle");
		class3 a1=new class3();
		try {
			a1.m1();
		}
	catch(Exception e)	{
		System.out.println("error message");
		System.out.println(e.getMessage());
	}
		
	}

public  void m1() throws IOException
{
	System.out.println("1st");
	m2();
}

	public void m2() throws IOException
	{
		System.out.println("2nd");
		m3();
	}

	public void m3() throws IOException
		{
			System.out.println("3rd");
			m4();
		}
	
	public void m4() throws IOException
	{
		System.out.println("expection start");
		throw new IOException();
		
		
			
		}
	}

