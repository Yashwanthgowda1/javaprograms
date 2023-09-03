package banking;

public class pack1 extends banking1{
	
	public static void main(String[]args) {
		System.out.println("1st customer ");
		banking1 a1=new banking1();
		a1.setacc_num(12345678935689l);
		a1.setacc_name1("sadhu");
		a1.setacc_bal(123546.23);
		a1.setifsc_code("Sbi1235xxx123");
		System.out.println("the bank acc num is"+a1.getacc_num()+"\n"+"the account holder name:"+a1.getacc_name1()+"\n"+"the account balnace is:"+a1.getacc_bal()+"\n"+"ifsc_code is:"+a1.getifsc_code());
		System.out.println("2nd customer ");
		banking1 a2=new banking1();
		a2.setacc_num(1);
		a2.setacc_name1("sadhu1");
		a2.setacc_bal(123.236);
		a2.setifsc_code("adcd12345cd");
		System.out.println("the bank acc num is"+a2.getacc_num()+"\n"+"the account holder name:"+a2.getacc_name1()+"\n"+"the account balnace is:"+a2.getacc_bal()+"\n"+"ifsc_code is:"+a2.getifsc_code());
		System.out.println(" 3nd customer");
		banking1 a3=new banking1();
		a3.setacc_num(1);
		a3.setacc_name1("sadhu2");
		a3.setacc_bal(123.236);
		a3.setifsc_code("adcd12345cd");
		System.out.println("the bank acc num is"+a3.getacc_num()+"\n"+"the account holder name:"+a3.getacc_name1()+"\n"+"the account balnace is:"+a3.getacc_bal()+"\n"+"ifsc_code is:"+a3.getifsc_code());
		
	}
		
}
