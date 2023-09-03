package interfaace1;


public class string {
	public static void main(String[] args) {
		String a="madam";
		String c="gdfvdfsm125hjhwhjqete3@";
		String m="";
//		String v="";
//		String b="";
		int count=0;
		int b=0;
		int x=0;
//		for (int i = a.length()-1; i >=0; i--) {
//			b=b+a.charAt(i);
//		}
//		System.out.println(b);
//		if(a.equals(b)) {
//			System.out.println("palidrome");
//			
//			
//		}
//		else
//		{
//			System.out.println("not a palidrome");
//		}
//		
//		
////		v=c.replaceAll("[^0-9]", "");
////		System.out.println(v);
////		int m=Integer.parseInt(v);
////		System.out.println(m);
//		
//	}
		for(int i=0;i<c.length();i++) {
			if(c.charAt(i)>='a' && c.charAt(i)<='z' || c.charAt(i)>='A' && c.charAt(i)<='Z') {
				
		
			count++;
		}
			else if(c.charAt(i)>='0' && c.charAt(i)<='9') {
				x++;
			}
		
			else {
				b++;
			}

}
		System.out.println(count);
		System.out.println("numbers"+x);
		System.out.println("special"+b);
	}
}
