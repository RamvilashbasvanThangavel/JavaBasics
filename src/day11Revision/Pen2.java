package day11Revision;

public class Pen2 {
	String brand;
	int price;
	int discount;

	public String findData(Pen2[] b) {
		Pen2 temp = b[0];
		for (int i = 0; i < b.length; i++) {
			if (temp.price < b[i].price) {
				temp = b[i];
			}
		}
		return temp.brand;
	}

}
