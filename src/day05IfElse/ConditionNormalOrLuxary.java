package day05IfElse;

public class ConditionNormalOrLuxary {
	public static void main(String[] args) {
		int price = Integer.parseInt(args[0]);
		if (price > 2000000) {
			System.out.println("luxary");
		} else {
			System.out.println("Normal");
		}
	}

}
