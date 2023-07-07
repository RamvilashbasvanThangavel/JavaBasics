package day07ForLoop2;

public class PrintMaxValueInArray {
	public static void main(String[] args) {
		int[] mark = { 10, 20, 48, 98, 100, 25, 56 };
		int max = mark[0];
		for (int i = 0; i <= mark.length - 1; i++) {
			if (mark[i] > max) {
				max = mark[i];
			}
		}
		System.out.println(max);
	}
}
