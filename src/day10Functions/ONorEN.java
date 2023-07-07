package day10Functions;

public class ONorEN {
	public void odd(int a) {
		if (a % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}
	}

	public String even(int a) {
		if (a % 2 == 0) {
			return "Even Number";
		} else {
			return "Odd Number";
		}
	}
}
