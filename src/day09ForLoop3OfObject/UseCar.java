package day09ForLoop3OfObject;

public class UseCar {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.company = "Suziki";
		c1.model = "ertiga";
		c1.cc = 1250;
		c1.price = 1200000;

		Car c2 = new Car();
		c2.company = "Toyato";
		c2.model = "Fortuner";
		c2.cc = 2400;
		c2.price = 3800000;

		Car c3 = new Car();
		c3.company = "Hyundai";
		c3.model = "i-10";
		c3.cc = 1200;
		c3.price = 900000;

		Car[] c = { c1, c2, c3 };

		for (int i = 0; i < c.length; i++) {
			System.out.println("1st Output : " + c[i].company.toUpperCase());
		}

		Car max = c[0];
		for (int i = 0; i < c.length; i++) {
			if (c[i].price > max.price) {
				max = c[i];
			}
		}
		System.out.println(
				"\n" + "2nd Output : " + max.company + "\n" + max.price + "\n" + max.model + "\n" + max.cc + "\n");

		Car min = c[0];
		for (int i = 0; i < c.length; i++) {
			if (c[i].cc < min.cc) {
				min = c[i];
			}
		}
		System.out.println("3nd Output : " + min.company + "," + min.price + "," + min.cc + "," + min.model + "\n");

		Car maxm = c[0];
		for (int i = 0; i < c.length; i++) {
			if (c[i].cc > maxm.cc) {
				maxm = c[i];
			}
		}
		System.out.println("4nd Output : " + maxm.company + "," + maxm.price + "," + maxm.cc + "," + maxm.model + "\n");

	}

}
