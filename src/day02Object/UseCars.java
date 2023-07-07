package day02Object;

public class UseCars {
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

		int totalAmount = c1.price + c2.price ;
		int totalCars = 2;
		System.out.println("Total amount of Cars = Rs." + totalAmount + "\n" + "Average amount = Rs. " + totalAmount / 6);

	}
}
