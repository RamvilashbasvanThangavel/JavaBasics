package day06ForLoop1;

public class ForPrintEg6charAtReverse {
	public static void main(String[] args) {
		String a = "Java";
		for (int i = a.length() - 1; i >= 0; i--) {
			System.out.println(a.charAt(i));
		}
	}

}
