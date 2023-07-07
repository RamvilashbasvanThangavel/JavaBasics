package day04Lms;

public class LmsSymbolSplit {
	public static void main(String[] args) {
		String[] a = args[0].split("-");
		int a1 = Integer.parseInt(a[0]);
		String a2 = a[1];
		String a3 = a[2];
		boolean a4 = Boolean.parseBoolean(a[3]);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);

	}

}
