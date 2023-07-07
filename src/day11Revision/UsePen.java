package day11Revision;

public class UsePen {
	public static void main(String[] args) {
		Pen p1 = new Pen();
		p1.brand = "Cello";
		p1.price = 10;
		p1.discount = 2;

		Pen p2 = new Pen();
		p2.brand = "Cello";
		p2.price = 10;
		p2.discount = 2;

		Pen p3 = new Pen();
		p3.brand = "Natraj";
		p3.price = 8;
		p3.discount = 5;

		Pen p4 = new Pen();
		p4.brand = "Cello";
		p4.price = 10;
		p4.discount = 2;

		int[] price1 = { p1.price, p2.price, p3.price, p4.price }; // 1st Output
		int[] discount1 = { p1.discount, p2.discount, p3.discount, p4.discount }; // 2nd Output
		System.out.println(p1.findhigh(price1));
		System.out.println(p1.findhigh(discount1));

		Pen[] pens = { p1, p2, p3, p4 };               // (if we are using pen as return type means need to take temporary variable)
		Pen temp = p1.findMaxBarnd(pens);
		System.out.println(temp.brand + "," + temp.price);

	}

}
