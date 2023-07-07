package day11Revision;

public class MaximumValue {
	public static void main(String[] args) {

		int[] a = { 10, 20, 3, 15, 18, 25 };
		int temp = a[0];
		for (int i = 0; i < a.length; i++) {
			if (temp < a[i]) {
				temp = a[i];
			}
		}
		System.out.println(temp);

	}
}
