package day08Revision;

public class PositiveAndNegative {
	public static void main(String[] args) {
		int[] numbers = { -13, 26, 54, 0, 87, -333, 148 };
		int pc = 0;
		int nc = 0;
		for (int i = 0; i <= numbers.length - 1; i++) {
			if (numbers[i] >= 0) {
				pc++;
			} else {
				nc++;
			}
		}
		System.out.println("Positive Count : " + pc);
		System.out.println("Negative Count : " + nc);
	}
}