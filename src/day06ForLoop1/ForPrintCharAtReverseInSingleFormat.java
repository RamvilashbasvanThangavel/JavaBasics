package day06ForLoop1;

public class ForPrintCharAtReverseInSingleFormat {
	public static void main(String[] args) {
		String a = "java";
		String temp = " ";
		for (int i = a.length() - 1; i >= 0; i--) {
			temp = temp + a.charAt(i);
		}
		System.out.println(temp);
	}
}
