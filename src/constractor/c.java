package constractor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class c  {
	public static void randomnumber() {
		Date fromate=new Date();
		SimpleDateFormat sdf =new SimpleDateFormat("hh_mm");
		String date=sdf.format(fromate);
		System.out.println(date);
	}
	public static void main(String[] args) {
		randomnumber();
	
		
		
	}

	
}

	
	
