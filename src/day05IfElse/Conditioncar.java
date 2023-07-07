package day05IfElse;

public class Conditioncar {
	public static void main(String[] args) {
		String colour = "white";
		int price = 500000;
		if (colour.equalsIgnoreCase("white")) {
			System.out.println(price);
		}
		else {
			System.out.println(price+100000);
		}
	}

}
