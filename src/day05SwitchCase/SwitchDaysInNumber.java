package day05SwitchCase;

public class SwitchDaysInNumber {
	public static void main(String[] args) {
		String days = "monday";
		switch (days) {
		case "monday":
			System.out.println("1");
			break;
		case "tuseday":
			System.out.println("2");
			break;
		case "wednesday":
			System.out.println("3");
			break;
		case "Thursday":
			System.out.println("4");
			break;
		case "friday":
			System.out.println("5");
			break;
		case "saturday":
			System.out.println("6");
			break;
		case "sundAY":
			System.out.println("7");
			break;
		default:
			System.out.println("Invalid Input");
		}
	}

}
