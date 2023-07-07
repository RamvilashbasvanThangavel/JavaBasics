package day10Functions;

public class Ac {
	String brand;
	int price;
	String color;
	float rating;

	public void maxob(Ac[] data) {
		Ac m = data[0];
		for (int i = 0; i < data.length; i++) {
			if (data[i].price > m.price) {
				m = data[i];
			}
		}
		System.out.println("Brand =" + m.brand + ", Color =" + m.color + ", price =" + m.price + ", Rating =" + m.rating);
	}

}
