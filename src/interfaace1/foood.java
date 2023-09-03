package interfaace1;

public class foood extends fooditem implements hotel{

	@Override
	public void hotel() {
		// TODO Auto-generated method stub
		System.out.println("welcome to kranna upaharaa ");
	}

	@Override
	void fooditem() {
		// TODO Auto-generated method stub
		System.out.println("ur order cup of coffee");
	}
	public static void main(String[] args) {
		foood a=new foood();
		a.hotel();
		a.fooditem();
		
	}
	

	

}
