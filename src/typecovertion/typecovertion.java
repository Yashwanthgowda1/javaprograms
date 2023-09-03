package typecovertion;

import java.text.SimpleDateFormat;
import java.util.Date;

public class typecovertion {

public static void main(String[] args) {
	Date formate=new Date();
	System.out.println(formate);
	SimpleDateFormat sdf=new SimpleDateFormat("year=month=date=hh=mm=ss");
	System.out.println(sdf.format(formate));
}
}
	


