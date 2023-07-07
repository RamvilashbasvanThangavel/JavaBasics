package day09ForLoop3OfObject;

public class UseAcEnhanceedForLoop {
	public static void main(String[] args) {
		Ac ac1 = new Ac();
		ac1.brand = "Samsung";
		ac1.tons = 2.5f;
		ac1.warrantyYears = 3;
		ac1.price = 45000;

		Ac ac2 = new Ac();
		ac2.brand = "Lg";
		ac2.tons = 1.6f;
		ac2.warrantyYears = 2;
		ac2.price = 80000;

		Ac ac3 = new Ac();
		ac3.brand = "Cromo";
		ac3.tons = 2.5f;
		ac3.warrantyYears = 3;
		ac3.price = 35000;

		Ac[] ac = { ac1, ac2, ac3 };
		for (Ac a : ac) {
			System.out.println("1st OutPut : " + a.price + "," + a.brand + "," + a.tons + "," + a.warrantyYears);
		}
		int total = 0;
		for (Ac b : ac) {
			total = total + b.price;
		}
		System.out.println("2nd Output : " + total);

		String max = ac[0].brand;
		for (Ac c : ac) {
			if (max.length() > c.brand.length()) {
				max = c.brand;
			}
		}
		System.out.println("3rd Output : " + max);

		Ac min = ac[0];
		for (Ac ab : ac) {
			if (min.tons > ab.tons) {
				min.tons = ab.tons;
			}
		}
		System.out.println("5th Output : " + min.brand);
		

		for (Ac d : ac) {
			if (d.brand.contains("a") || d.brand.contains("e") || d.brand.contains("i") || d.brand.contains("o")
					|| d.brand.contains("u")) {
				System.out.println("6th Output : " + d.brand);
			}
		}
		

		for (Ac e : ac) {
			if (e.price % 2 == 0) {
				System.out.println("7 Output : " + e.brand);
	    }
		
	}
}
}