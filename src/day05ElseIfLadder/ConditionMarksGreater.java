package day05ElseIfLadder;

public class ConditionMarksGreater {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		if (a >= 90 && a <= 100) {
			System.out.println("A");
		} else if (a >= 80 && a < 90) {
			System.out.println("B");
		} else if (a >= 70 && a < 80) {
			System.out.println("C");
		} else if (a >= 60 && a < 70) {
			System.out.println("D");
		} else if (a >= 50 && a < 60) {
			System.out.println("E");
		} else if (a < 50 && a >= 0) {
			System.out.println("Fail");
		} else {
			System.out.println("Invalid Input");
		}
	}

}
