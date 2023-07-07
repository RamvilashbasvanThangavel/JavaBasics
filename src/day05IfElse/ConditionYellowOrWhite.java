package day05IfElse;

public class ConditionYellowOrWhite {
	public static void main(String[] args) {
		String colour = args[0];
		if (colour.equalsIgnoreCase("white")) {
			System.out.println(colour + " will be Private");
		} else {
			System.out.println(colour + " will be Public");
		}
	}
}