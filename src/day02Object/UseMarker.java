package day02Object;

public class UseMarker {
	public static void main(String[] args) {
		Marker m1 = new Marker();
		m1.Price = 20;
		m1.brand = "Reynold";
		m1.colour = "Black";
		m1.thickness = 2.5f;
		m1.isColourBlue = false;
		m1.netPrice = m1.Price + (m1.Price * 5 / 100);
		System.out.println("Marker-01" + "\n" + "Price- " + m1.Price + "\n" + "Brand- " + m1.brand + "\n" + "Colour- "
				+ m1.colour + "\n" + "Thickness- " + m1.thickness + "\n" + "Netprice- " + m1.netPrice + "\n"
				+ "Is colour Blue-" + m1.isColourBlue + "\n");

		Marker m2 = new Marker();
		m2.Price = 05;
		m2.brand = "Natraj";
		m2.colour = "Black";
		m2.thickness = 3.6f;
		m2.netPrice = m2.Price + (m2.Price * 5 / 100);
		System.out.println("Marker-02" + "\n" + "Price- " + m2.Price + "\n" + "Brand- " + m2.brand + "\n" + "Colour- "
				+ m2.colour + "\n" + "Thickness- " + m2.thickness + "\n" + "Netprice- " + m2.netPrice + "\n");

		Marker m3 = new Marker();
		m3.Price = 10;
		m3.brand = "Natraj";
		m3.colour = "Blue";
		m3.thickness = 10.5f;
		m3.netPrice = m3.Price + (m3.Price * 50 / 100);
		System.out.println("Marker-03" + "\n" + "Price- " + m3.Price + "\n" + "Brand- " + m3.brand + "\n" + "Colour- "
				+ m3.colour + "\n" + "Thickness- " + m3.thickness + "\n" + "Netprice- " + m3.netPrice + "\n");
	}

}
