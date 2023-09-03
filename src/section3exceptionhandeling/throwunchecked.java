package section3exceptionhandeling;

import java.io.IOException;

public class throwunchecked {
public static void main(String[] args) throws IOException {
	throwunchecked a=new throwunchecked();
	System.out.println("main starts");
	a.m1();	
}
public void m1() throws IOException {
	System.out.println("m1 starts");
	m2();
	System.out.println("m1 ends");
}
public void m2() throws IOException {
	System.out.println("m2 ends");
	m3();
	System.out.println("m2ends");
}
public void m3() throws IOException {
	System.out.println("m3 starts");
	
	throw new IOException();

	
}

{
	
}
}
