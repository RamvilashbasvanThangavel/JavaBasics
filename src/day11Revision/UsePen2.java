package day11Revision;

public class UsePen2 {
	public static void main(String[] args) {
		Pen2 p1 = new Pen2();
		p1.brand = "Cello";
		p1.price = 10;
		p1.discount = 2;

		Pen2 p2 = new Pen2();
		p2.brand = "Cello";
		p2.price = 15;
		p2.discount = 4;

		Pen2 p3 = new Pen2();
		p3.brand = "Natraj";
		p3.price = 8;
		p3.discount = 5;

		Pen2 p4 = new Pen2();
		p4.brand = "Cello";
		p4.price = 20;
		p4.discount = 6;

		Pen2[] pen = { p1, p2, p3, p4 };
		System.out.println(p1.findData(pen));
	}
}
