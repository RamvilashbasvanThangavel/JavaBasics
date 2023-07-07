package day07ForLoop2;

public class Plural {
	public static void main(String[] args) {
		String[] a = { "apples", "orange", "grapes", "guava", "mangoes" };
		int p = 0;         // indicates the count of plural
		int s = 0;         // indicates the count of Singular
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i].endsWith("s")) {
				System.out.println("P : " + a[i]);
				p++;
			} else {
				System.out.println("s : " + a[i]);
				s++;
			}
		}
		System.out.println("Plural count : " + p);
		System.out.println("Non Plural count : " + s);
	}
}
