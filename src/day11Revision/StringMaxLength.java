package day11Revision;

public class StringMaxLength {
	public static void main(String[] args) {
		String[] a = { "ram", "kavi", "deav", "Muthu" };
		String temp = a[0];
		for (int i = 0; i < a.length; i++) {
			if (temp.length() < a[i].length()) {
				temp = a[i];
			}
		}
		System.out.println(temp);

	}
}
