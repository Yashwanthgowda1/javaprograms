package exception;

import java.io.IOException;

public class class1 {

		public static void main(String[] args) throws Exception {
			System.out.println("not handle");
			class1 a1=new class1();
				a1.m1();
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




