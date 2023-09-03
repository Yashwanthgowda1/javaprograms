package collectioninterface;

import java.util.ArrayList;

public class ovels {
	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add("yashu");
		a1.add('i');
		a1.add('m');
		a1.add('v');
		a1.add('a');
		a1.add(null);
		System.out.println(a1);
		for (int i = 0; i < a1.size(); i++) {
			Object obj = a1.get(i);
			if (obj instanceof Character) {
				char a = (char) obj;
				if ((a == 'a' || a == 'i' || a == 'o' || a == 'e' || a == 'u')) {
					System.out.println(a);
				}
			}

		}

	}
}
