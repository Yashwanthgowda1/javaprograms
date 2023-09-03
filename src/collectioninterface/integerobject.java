package collectioninterface;

import java.util.ArrayList;

public class integerobject {
	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add("yashu");
		a1.add("sadhu");
		a1.add("amma");
		a1.add("apppa");
		a1.add(35);
		a1.add(16);
		a1.add(29);
		
		a1.add(null);
		System.out.println(a1);

		for (int i = 0; i < a1.size(); i++) {
			Object obj = a1.get(i);
			if (obj instanceof Integer) {
				int a = (int) obj;
				if (a >= 15 && a <= 25) {
					System.out.println(a);
				}

			}

		}
	}
}
