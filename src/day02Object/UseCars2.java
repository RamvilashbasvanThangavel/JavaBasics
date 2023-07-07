package day02Object;

public class UseCars2 {
	public static void main(String[] args) {
		Cars c1 = new Cars();
		c1.brand = "Suziki";
		c1.price = 1500000;
		c1.model = "Ertiga";
		c1.colour = "black";
		c1.cc = 1200;
		c1.discountamount = (c1.price * 5 / 100);
		c1.netPrice = c1.price - c1.discountamount;
		System.out.println("Car-01" + "\n" + "Brand- " + c1.brand + "\n" + "Price- " + c1.price + "\n" + "Model- "
				+ c1.model + "\n" + "Colour- " + c1.colour + "\n" + "CC- " + c1.cc + "\n" + "Discountamount- "
				+ c1.discountamount + "\n" + "Netprice- " + c1.netPrice + "\n");

		Cars c2 = new Cars();
		c2.brand = "volkswagen";
		c2.price = 500000;
		c2.model = "polo";
		c2.colour = "Red";
		c2.cc = 2200;
		c2.discountamount = (c2.price * 5 / 100);
		c2.netPrice = c2.price - c2.discountamount;
		System.out.println("Car-02" + "\n" + "Brand- " + c2.brand + "\n" + "Price- " + c2.price + "\n" + "Model- "
				+ c2.model + "\n" + "Colour- " + c2.colour + "\n" + "CC- " + c2.cc + "\n" + "Discountamount- "
				+ c2.discountamount + "\n" + "Netprice- " + c2.netPrice + "\n");

		Cars c3 = new Cars();
		c3.brand = "Hyundai";
		c3.price = 800000;
		c3.model = "Creta";
		c3.colour = "White";
		c3.cc = 1800;
		c3.discountamount = (c3.price * 8 / 100);
		c3.netPrice = c3.price - c3.discountamount;
		System.out.println("Car-03" + "\n" + "Brand- " + c3.brand + "\n" + "Price- " + c3.price + "\n" + "Model- "
				+ c3.model + "\n" + "Colour- " + c3.colour + "\n" + "CC- " + c3.cc + "\n" + "Discountamount- "
				+ c3.discountamount + "\n" + "Netprice- " + c3.netPrice + "\n");

		Cars c4 = new Cars();
		c4.brand = "Hyundai";
		c4.price = 1200000;
		c4.model = "Verna";
		c4.colour = "Blue";
		c4.cc = 2200;
		c4.discountamount = (c4.price * 6 / 100);
		c4.netPrice = c4.price - c4.discountamount;
		System.out.println("Car-04" + "\n" + "Brand- " + c4.brand + "\n" + "Price- " + c4.price + "\n" + "Model- "
				+ c4.model + "\n" + "Colour- " + c4.colour + "\n" + "CC- " + c4.cc + "\n" + "Discountamount- "
				+ c4.discountamount + "\n" + "Netprice- " + c4.netPrice + "\n");

		Cars c5 = new Cars();
		c5.brand = "Hyundai";
		c5.price = 700000;
		c5.model = "Grand i10";
		c5.colour = "Blue";
		c5.cc = 2200;
		c5.discountamount = (c5.price * 5 / 100);
		c5.netPrice = c5.price - c5.discountamount;
		System.out.println("Car-05" + "\n" + "Brand- " + c5.brand + "\n" + "Price- " + c5.price + "\n" + "Model- "
				+ c5.model + "\n" + "Colour- " + c5.colour + "\n" + "CC- " + c5.cc + "\n" + "Discountamount- "
				+ c5.discountamount + "\n" + "Netprice- " + c5.netPrice + "\n");

		Cars c6 = new Cars();
		c6.brand = "Toyato";
		c6.price = 4500000;
		c6.model = "Fortuner";
		c6.colour = "White";
		c6.cc = 2800;
		c6.discountamount = (c6.price * 5 / 100);
		c6.netPrice = c6.price - c6.discountamount;
		System.out.println("Car-06" + "\n" + "Brand- " + c6.brand + "\n" + "Price- " + c6.price + "\n" + "Model- "
				+ c6.model + "\n" + "Colour- " + c6.colour + "\n" + "CC- " + c6.cc + "\n" + "Discountamount- "
				+ c6.discountamount + "\n" + "Netprice- " + c6.netPrice + "\n");

		int totalAmount = c1.price + c2.price + c3.price + c4.price + c5.price + c6.price;
		int totalCars = 6;
		System.out
				.println("Total amount of Cars = Rs." + totalAmount + "\n" + "Average amount = Rs. " + totalAmount / 6);

	}
}
