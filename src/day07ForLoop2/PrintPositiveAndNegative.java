package day07ForLoop2;

public class PrintPositiveAndNegative {
	public static void main(String[] args) {
		int[] marks = { -10, 15, 98, -100, 25, -35 };
		int pc = 0;
		int nc = 0;
		for (int i = 0; i <= marks.length - 1; i++) {
			if (marks[i] >= 0) {
				pc++;
			} else if (marks[i] < 0) {
				nc++;
			}
		}
		System.out.println("Positive count is : " + pc);
		System.out.println("Negative count is : " + nc);
	}

}
