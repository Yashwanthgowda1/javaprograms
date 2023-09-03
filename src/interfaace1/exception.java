package interfaace1;

import java.io.IOException;


public class exception {
	public static void main(String[] args) throws InterruptedException, IOException {
		exception a1=new exception();
		a1.m1();
		
	}
	public void m1()  throws InterruptedException, IOException {
		System.out.println("m1 method");
		m2();
	}
	public void m2() throws InterruptedException, IOException{
		System.out.println("m2.methods");
		
		
		m3();
		
	}
	public void m3() throws IOException {
		System.out.println("m3.methods");
	}

}
