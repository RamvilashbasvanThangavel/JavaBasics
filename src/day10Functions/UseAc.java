package day10Functions;

public class UseAc {
	public static void main(String[] args) {
		Ac ac1 = new Ac();
		ac1.brand = "LG";
		ac1.price = 100000;
		ac1.color = "Black";
		ac1.rating = 4.5f;

		Ac ac2 = new Ac();
		ac2.brand = "Cromo";
		ac2.price = 35000;
		ac2.color = "Blue";
		ac2.rating = 3.5f;

		Ac ac3 = new Ac();
		ac3.brand = "Sony";
		ac3.price = 45000;
		ac3.color = "Gray"; 
		ac3.rating = 3.5f;

		Ac ac4 = new Ac();
		ac4.brand = "Bpl";
		ac4.price = 20000;
		ac4.color = "White";
		ac4.rating = 3.5f;

		Ac[] acs = { ac1, ac2, ac3, ac4 };
        ac2.maxob(acs);
	}
}
